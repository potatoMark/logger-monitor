package com.fujitsu;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.util.StringConverter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainController implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @FXML
    private JFXButton jfxButtonStart;

    @FXML
    private JFXDatePicker jfxDatePickerBegin;

    @FXML
    private JFXTimePicker jfxTimePickerBegin;

    @FXML
    private JFXDatePicker jfxDatePickerEnd;

    @FXML
    private JFXTimePicker jfxTimePickerEnd;

    @FXML
    private Label treeTableViewCount;

    @FXML
    private JFXTreeTableView<Content> jfxTreeTableView;

    @FXML
    private JFXTreeTableColumn<Content, String> jfxTreeTableColumnTime;

    @FXML
    private JFXTreeTableColumn<Content, String> jfxTreeTableColumnPrint;

    @FXML
    private JFXTreeTableColumn<Content, String> jfxTreeTableColumnRecord;

    @FXML
    private JFXTreeTableColumn<Content, String> jfxTreeTableColumnState;

    private ObservableList<Content> contents = FXCollections.observableArrayList();

    private AtomicLong readIndex = new AtomicLong(0);

    private ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);

    private String _selTime = "";

    @FXML
    void buttonClick() {

        logger.info("触发按钮");


    }

    public void readPrintRecord() {

        Task<Void> loopTask = new Task<Void>() {
            @Override
            protected Void call() throws Exception {

                while (true) {
                    Platform.runLater(() -> {
                                try {
                                    ObservableList<Content> list = FXCollections.observableArrayList();

                                    String yyyyMMdd = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                                    //获取路径
                                    String homeUrl = System.getProperty("user.home");

                                    File logFile = new File(homeUrl + File.separator + "printLog" + File.separator + "printLog_" + yyyyMMdd + ".log");


                                    if (!logFile.exists()) {
                                        return;
                                    }
                                    if (logFile.length() < readIndex.get()) {
                                        contents = FXCollections.observableArrayList();
                                        readIndex.set(0L);
                                    }

                                    RandomAccessFile randomFile = new RandomAccessFile(logFile, "rw");
                                    randomFile.seek(readIndex.get());

                                    String record;

                                    while (StringUtils.isNotEmpty(record = randomFile.readLine())) {
                                        String r = new String(record.getBytes("ISO-8859-1"), "UTF-8");
                                        String time = r.substring(0, 19);
                                        String information = r.substring(19, r.length() - 12);
                                        String print = r.substring(r.length() - 12, r.length() - 2);
                                        String state = r.substring(r.length() - 2, r.length());
                                        Content content = new Content(time, print.trim(),information, state);
                                        list.add(content);
                                    }
                                    readIndex.set(randomFile.getFilePointer());
                                    randomFile.close();

                                    ObservableList<Content> vieList = FXCollections.observableArrayList();
                                    contents.addAll(list);

                                    //过滤
                                    String date = jfxDatePickerBegin.getValue().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                                    String time = jfxTimePickerBegin.getValue().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                                    String dateTime = String.join(" ", date, time);

                                    List<Content> collect = contents.stream().filter(item -> {
                                        String refItem = item.getTime().getValue();
                                        LocalDateTime refItemLoc = LocalDateTime.parse(refItem, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
                                        LocalDateTime selLoc = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

                                        return refItemLoc.isAfter(selLoc);
                                    }).collect(Collectors.toList());

//                        contents = FXCollections.observableArrayList(collect);
                                    vieList.addAll(collect);


                                    Collections.sort(vieList, Comparator.comparing(Content::getTime, (a, b) -> b.get().compareTo(a.get())));

                                    jfxTreeTableView.setRoot(new RecursiveTreeItem<>(vieList, RecursiveTreeObject::getChildren));
                                    jfxTreeTableView.setShowRoot(false);
                                    for (int i = 0; i < vieList.size(); i++) {
                                        if (vieList.get(i).getTime().get().equals(_selTime)) {
                                            jfxTreeTableView.getSelectionModel().clearAndSelect(i);
                                        }
                                    }
                                } catch (FileNotFoundException e) {
                                    logger.error("文件没有找到", e);
                                } catch (IOException e) {
                                    logger.error("发生IO异常", e);
                                } finally {
                                }

                            }

                    );

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };

        Thread thread = new Thread(loopTask);
        thread.setDaemon(true);
        thread.start();

    }

    public void initialize(URL location, ResourceBundle resources) {

        //设置查询条件
        jfxDatePickerBegin.setValue(LocalDate.now());
        jfxTimePickerBegin.setValue(LocalTime.of(0, 0, 0));
//        jfxTimePickerBegin.setConverter(new StringConverter<LocalTime>() {
//            @Override
//            public String toString(LocalTime object) {
//
////                return String.format("%02d", object.getHour()).concat(":00:00");
//
//                if (object != null) {
//                    return object.format(DateTimeFormatter.ofPattern("HH:00:00"));
//                } else {
//                    return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:00:00"));
//                }
//            }
//
//            @Override
//            public LocalTime fromString(String string) {
//                return null;
//            }
//        });

        jfxDatePickerEnd.setValue(LocalDate.now());
        jfxTimePickerEnd.setValue(LocalTime.of(23, 59, 59));
        jfxTimePickerEnd.setConverter(new StringConverter<LocalTime>() {
            @Override
            public String toString(LocalTime object) {

                return String.format("%02d", object.getHour()).concat(":59:59");
            }

            @Override
            public LocalTime fromString(String string) {
                return null;
            }
        });

        //初始化table
        setupCellValueFactory(jfxTreeTableColumnTime, Content::getTime);
        setupCellValueFactory(jfxTreeTableColumnPrint, Content::getPrint);
        setupCellValueFactory(jfxTreeTableColumnRecord, Content::getRecord);
        setupCellValueFactory(jfxTreeTableColumnState, Content::getState);
        jfxTreeTableView.setOnMouseClicked(event -> {
            Platform.runLater(() -> {
                if (jfxTreeTableView.getSelectionModel().getSelectedItem() != null) {
                    String selectTimeValue = jfxTreeTableView.getSelectionModel().getSelectedItem().getValue().getTime().get();
                    _selTime = selectTimeValue;
                }
            });
        });

        treeTableViewCount.textProperty()
                .bind(Bindings.createStringBinding(() -> "打印信息一览 (" + jfxTreeTableView.getCurrentItemsCount() + ")",
                        jfxTreeTableView.currentItemsCountProperty()));

        readPrintRecord();


    }

    private <T> void setupCellValueFactory(JFXTreeTableColumn<Content, T> column, Function<Content, ObservableValue<T>> mapper) {
        column.setCellValueFactory((TreeTableColumn.CellDataFeatures<Content, T> param) -> {
            if (column.validateValue(param)) {
                return mapper.apply(param.getValue().getValue());
            } else {
                return column.getComputedValue(param);
            }
        });
    }


}

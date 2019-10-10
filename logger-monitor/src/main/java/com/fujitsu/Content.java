package com.fujitsu;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Content extends RecursiveTreeObject<Content> {

    final StringProperty time;

    final StringProperty print;

    final StringProperty record;

    final StringProperty state;


    Content(String time, String print, String record, String state) {
        this.time = new SimpleStringProperty(time);
        this.print = new SimpleStringProperty(print);
        this.record = new SimpleStringProperty(record);
        this.state = new SimpleStringProperty(state);
    }

}

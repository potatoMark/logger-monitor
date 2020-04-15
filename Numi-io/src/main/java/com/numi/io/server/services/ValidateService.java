package com.numi.io.server.services;

import com.numi.io.common.entities.BrBoundarymanage;
import com.numi.io.common.json.Body;
import com.numi.io.common.json.Root;
import com.numi.io.common.json.Validate;
import com.numi.io.common.message.Message;
import com.numi.io.server.entities.Data;
import com.numi.io.server.entities.Result;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Component
public class ValidateService {
    private static final Logger logger = LoggerFactory.getLogger(ValidateService.class);

    private String ymdRegx = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";

    private String ymdhmsRegx = "^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))\\s+([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";


    public boolean checkSysNameIsExist(Data data, Result result, BrBoundarymanage brBoundarymanage) {
        if (brBoundarymanage == null) {
            result.setResult("1");
            result.setMessage("当前sys=" + data.getSys() + "，未与OTD系统做过对接，系统无法接收对应数据");
            result.setSendNumber("");
            logger.info("当前sys=" + data.getSys() + "，未与OTD系统做过对接，系统无法接收对应数据");
            return true;
        }
        return false;
    }

    public Message analyzeData(Data data, Root json) throws ClassNotFoundException, JAXBException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Message message = new Message();
        message.setResult(true);
        Class<?> esbEnityClazz = Class.forName(json.getHeader().getEsbEntity());
        JAXBContext context = JAXBContext.newInstance(esbEnityClazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        List<Object> tableEntityList = new ArrayList<>();
        int i = 1;
        for (Object obj : data.getItems().getItem()) {
            ElementNSImpl elementNS = (ElementNSImpl) obj;

            Document ownerDocument = elementNS.getOwnerDocument();
            //对ESB数据进行解析，并转译成指定实体类
            Object esbEntity = unmarshaller.unmarshal(ownerDocument);
            //实例化一个tableEnity对象

            Class<?> tableEnityClazz = Class.forName(json.getHeader().getTableEntity());

            Object tableEntity = tableEnityClazz.newInstance();

            //根据Json中 esb&table字段对照，循环从ESB取出数据并写入到table指定字段中
            List<Body> bodies = json.getBody();

            for (Body body : bodies) {
                //首字母大写
                char[] esbFied = this.firstCapitalization(body.getEsbField());

                char[] tableField = this.firstCapitalization(body.getTableField());

                //获取get方法
                Method getMethod = esbEnityClazz.getMethod("get" + new String(esbFied));

                //获取set方法
                Method setMethod = tableEnityClazz.getMethod("set" + new String(tableField), String.class);

                //取得结果
                String str = (String) getMethod.invoke(esbEntity);

                //对结果内容进行相应的check
                if (commonValidator(message, i, body, str)) return message;

                //设置结果
                setMethod.invoke(tableEntity, str);

            }

            tableEntityList.add(tableEntity);
            i++;
        }
        message.setTableEntityList(tableEntityList);
        return message;
    }

    private boolean commonValidator(Message message, int i, Body body, String str) {
        Validate validate = body.getValidate();
        if (validate == null) {
            return false;
        }
        //required check
        if (validate.isRequired()) {
            if (StringUtils.isEmpty(str)) {
                message.setResult(false);
                message.setMessage("第{}条数据,{},不允许为空。", i, body.getEsbField());
                logger.info("第{}条数据,{},不允许为空。", i, body.getEsbField());
                return true;
            }
        }

        //字符类型check
        String characterType = validate.getCharacterType();
        if (StringUtils.isNotEmpty(characterType)) {
            switch (characterType) {
                case "digital":
                    if (!str.matches("^[-\\\\+]?([0-9]+\\\\.?)?[0-9]+$")) {
                        message.setResult(false);
                        message.setMessage("第{}条数据,{},必须为数字。", i, body.getEsbField());
                        logger.info("第{}条数据,{},必须为数字。", i, body.getEsbField());
                        return true;
                    }
                    break;
                case "date":
                    if (!str.matches(ymdRegx)) {
                        message.setResult(false);
                        message.setMessage("第{}条数据,{},必须为年月日格式YYYY-MM-DD。", i, body.getEsbField());
                        logger.info("第{}条数据,{},必须为年月日格式YYYY-MM-DD。", i, body.getEsbField());
                        return true;
                    }
                    break;
                case "datetime":
                    if (!str.matches(ymdhmsRegx)) {
                        message.setResult(false);
                        message.setMessage("第{}条数据,{},必须为年月日时分秒格式YYYY-MM-DD HH:mm:ss。", i, body.getEsbField());
                        logger.info("第{}条数据,{},必须为年月日时分秒格式YYYY-MM-DD HH:mm:ss。", i, body.getEsbField());
                        return true;
                    }
                    break;
                case "boolean":
                    if (!"true".equals(str) || !"false".equals(str)) {
                        message.setResult(false);
                        message.setMessage("第{}条数据,{},必须为字符true或者false。", i, body.getEsbField());
                        logger.info("第{}条数据,{},必须为字符true或者false。", i, body.getEsbField());
                        return true;
                    }
                    break;
                default:
                    message.setResult(false);
                    message.setMessage("第{}条数据,{}在Json定义的数据格式在代码里未实现，请联系OTD管理员。", i, body.getEsbField());
                    logger.info("第{}条数据,{}在Json定义的数据格式在代码里未实现。", i, body.getEsbField());
                    return true;
            }
        }

        //枚举check
        List<Object> enums = validate.getEnums();
        if (enums != null && enums.size() > 0) {

            if (!enums.contains(str)) {
                message.setResult(false);
                message.setMessage("第{}条数据,{},必须是{}中的一个值。", i, body.getEsbField(), StringUtils.join(enums, ","));
                logger.info("第{}条数据,{},必须是{}中的一个值。", i, body.getEsbField(), StringUtils.join(enums, ","));
                return true;
            }
        }

        //长度check mini
        if (validate.getMinLength() > 0) {
            if (str.length() < validate.getMinLength()) {
                message.setResult(false);
                message.setMessage("第{}条数据,{},长度必须大于等于{}。", i, body.getEsbField(), validate.getMinLength());
                logger.info("第{}条数据,{},长度必须大于等于{}。", i, body.getEsbField(), validate.getMinLength());
                return true;
            }
        }
        //max check
        if (validate.getMaxLength() > 0) {
            if (str.length() > validate.getMaxLength()) {
                message.setResult(false);
                message.setMessage("第{}条数据,{},长度必须小于等于{}。", i, body.getEsbField(), validate.getMaxLength());
                logger.info("第{}条数据,{},长度必须小于等于{}。", i, body.getEsbField(), validate.getMaxLength());
                return true;
            }
        }
        //正则表达式check
        if (StringUtils.isNotEmpty(validate.getRegExp())) {

            if (!str.matches(validate.getRegExp())) {
                message.setResult(false);
                message.setMessage("第{}条数据,{},不满足正则表达式验证要求，{}。", i, body.getEsbField(), validate.getRegExp());
                logger.info("第{}条数据,{},不满足正则表达式验证要求，{}。", i, body.getEsbField(), validate.getRegExp());
                return true;
            }
        }
        return false;
    }


    private char[] firstCapitalization(String str) {

        char[] fied = str.toCharArray();

        if (fied[0] >= 'a' && fied[0] <= 'z') {

            fied[0] = (char) (fied[0] - 32);

        }

        return fied;
    }

}

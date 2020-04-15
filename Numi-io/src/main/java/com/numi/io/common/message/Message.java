package com.numi.io.common.message;

import java.util.List;

public class Message {

    private String message;

    private List<Object> tableEntityList;

    private boolean result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message,Object ...param) {
        if (param != null && param.length != 0) {
            for (Object obj : param) {
                message = message.replaceFirst("\\{\\}",String.valueOf(obj));
            }
        }
        this.message = message;

    }

    public List<Object> getTableEntityList() {
        return tableEntityList;
    }

    public void setTableEntityList(List<Object> tableEntityList) {
        this.tableEntityList = tableEntityList;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}

package com.numi.io.common.json;
public class Header
{
    private String tableName;

    private String tableEntity;

    private String esbEntity;

    private String inputModel;// insert update custom

    private String excuteClass;

    private String validateClass;


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableEntity() {
        return tableEntity;
    }

    public void setTableEntity(String tableEntity) {
        this.tableEntity = tableEntity;
    }

    public String getEsbEntity() {
        return esbEntity;
    }

    public void setEsbEntity(String esbEntity) {
        this.esbEntity = esbEntity;
    }

    public String getInputModel() {
        return inputModel;
    }

    public void setInputModel(String inputModel) {
        this.inputModel = inputModel;
    }

    public String getExcuteClass() {
        return excuteClass;
    }

    public void setExcuteClass(String excuteClass) {
        this.excuteClass = excuteClass;
    }

    public String getValidateClass() {
        return validateClass;
    }

    public void setValidateClass(String validateClass) {
        this.validateClass = validateClass;
    }
}
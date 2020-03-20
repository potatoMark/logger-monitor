package com.numi.io.json;
public class Body
{
    private String tableField;

    private String esbField;

    private Validate validate;

    private boolean condition;

    public void setTableField(String tableField){
        this.tableField = tableField;
    }
    public String getTableField(){
        return this.tableField;
    }
    public void setEsbField(String esbField){
        this.esbField = esbField;
    }
    public String getEsbField(){
        return this.esbField;
    }
    public void setValidate(Validate validate){
        this.validate = validate;
    }
    public Validate getValidate(){
        return this.validate;
    }
    public boolean isCondition() {
        return condition;
    }
    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
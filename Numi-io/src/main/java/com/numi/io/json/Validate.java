package com.numi.io.json;
import java.util.List;

public class Validate
{
    private boolean required;

    private String characterType;

    private List<Object> enums;

    private int maxLength;

    private int minLength;

    private String regExp;

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public List<Object> getEnums() {
        return enums;
    }

    public void setEnums(List<Object> enums) {
        this.enums = enums;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public String getRegExp() {
        return regExp;
    }

    public void setRegExp(String regExp) {
        this.regExp = regExp;
    }

}

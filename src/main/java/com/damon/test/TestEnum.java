package com.damon.test;

/**
 * 活动结束状态枚举
 * 
 * @author zhw
 */
public enum TestEnum {

    INSTANCE(new StringBuilder());

    private StringBuilder stringBuilder;

    TestEnum(StringBuilder stringBuilder) {
        stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }
}

package com.lizhi.xingbao.common;

public enum ResultCode {
    SUCCESS(200,"成功返回"),
    UNKNOWN_ERROR(498,"未知异常"),
    COMMON_ERROR(499,"通用错误");

    private int    value;
    private String desc;

    private ResultCode(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "[" + this.value + ":" + this.desc + "]";
    }
}

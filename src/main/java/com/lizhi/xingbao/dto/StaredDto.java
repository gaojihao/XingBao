package com.lizhi.xingbao.dto;


import java.io.Serializable;

public class StaredDto implements Serializable {
    private static final long serialVersionUID = -9167770132750087726L;

    /**
     * 所属个人
     */
    private String userId;

    /**
     *所属课程
     */
    private Integer course;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }
}

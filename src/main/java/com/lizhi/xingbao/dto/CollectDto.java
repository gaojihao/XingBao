package com.lizhi.xingbao.dto;


import java.io.Serializable;

public class CollectDto implements Serializable {
    private static final long serialVersionUID = 8100630764832362134L;

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

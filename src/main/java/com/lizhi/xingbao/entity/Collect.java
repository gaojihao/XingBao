package com.lizhi.xingbao.entity;

import javax.persistence.*;

@Entity
@Table(name = "collect")
public class Collect extends BaseEntity{

    private static final long serialVersionUID = 2021114237133735688L;
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

    @Override
    public String toString() {
        return "Collect{" +
                "userId='" + userId + '\'' +
                ", course=" + course +
                '}';
    }
}

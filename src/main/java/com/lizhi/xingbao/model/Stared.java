package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "star")
public class Stared extends BaseEntity{

    private static final long serialVersionUID = -5917699228674048265L;
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
        return "Stared{" +
                "userId='" + userId + '\'' +
                ", course=" + course +
                '}';
    }
}

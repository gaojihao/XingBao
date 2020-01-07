package com.lizhi.xingbao.entity;


import javax.persistence.*;

@Entity
@Table(name = "star")
public class Stared extends BaseEntity{

    private static final long serialVersionUID = -5917699228674048265L;
    /**
     * 所属个人
     */
    @Column(name = "user_id")
    private String userId;

    /**
     *所属课程
     */
    @Column(name = "course")
    private Integer course;

    /**
     * 类型
     */
    @Column(name = "type")
    private int type;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

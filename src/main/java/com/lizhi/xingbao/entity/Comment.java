package com.lizhi.xingbao.entity;


import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment extends BaseEntity{

    private static final long serialVersionUID = -2734781684459288232L;
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
     * 评论内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 评分
     */
    @Column(name = "level")
    private Integer level;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

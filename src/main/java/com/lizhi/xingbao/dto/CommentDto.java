package com.lizhi.xingbao.dto;


import java.io.Serializable;

public class CommentDto implements Serializable {
    private static final long serialVersionUID = -6619394898220969522L;

    /**
     * 所属个人
     */
    private String userId;

    /**
     *所属课程
     */
    private Integer course;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评分
     */
    private Integer level;

    private Integer commentId;

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

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
}

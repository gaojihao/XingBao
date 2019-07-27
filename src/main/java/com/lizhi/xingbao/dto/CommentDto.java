package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
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
}

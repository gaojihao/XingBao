package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comment")
@EqualsAndHashCode(callSuper = false)
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
}

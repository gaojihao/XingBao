package com.lizhi.xingbao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "audio")
public class Audio extends BaseEntity{

    private static final long serialVersionUID = 2875226371844957533L;
    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 资源地址
     */
    @Column(name = "url")
    private String url;

    /**
     * 时长
     */
    @Column(name = "duration")
    private Integer duration;

    /**
     * 所属课程
     */
    @Column(name = "course")
    private Integer course;
}

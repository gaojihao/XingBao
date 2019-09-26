package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "video")
@EqualsAndHashCode(callSuper = false)
public class Video extends BaseEntity{

    private static final long serialVersionUID = 5007825733826546423L;
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

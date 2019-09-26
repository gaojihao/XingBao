package com.lizhi.xingbao.entity;

import lombok.Data;

import javax.persistence.*;



@Data
@Entity
@Table(name = "blog")
public class Blog extends BaseEntity{

    private static final long serialVersionUID = -8386641090887103548L;

    @Column( name = "title",nullable = false,length = 50)
    private String title;

    @Column(name = "summary", nullable = false,length = 128)
    private String summary;

    @Column(name = "url",nullable = false)
    private String url;

    @Column(name = "read_num")
    private Integer readNum = 0;

    @Column(name = "content", nullable = false,length = 4096)
    private String content;
}

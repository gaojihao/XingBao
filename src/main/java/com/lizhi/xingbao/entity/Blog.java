package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;



@Data
@Entity
@Table(name = "blog")
@EqualsAndHashCode(callSuper = false)
public class Blog extends BaseEntity{

    private static final long serialVersionUID = -8386641090887103548L;

    @Column( name = "title")
    private String title;

    @Column(name = "summary")
    private String summary;

    @Column(name = "url")
    private String url;

    @Column(name = "read_num")
    private Integer readNum = 0;

    @Column(name = "content")
    private String content;

    @Column(name = "cover")
    private String cover;

}

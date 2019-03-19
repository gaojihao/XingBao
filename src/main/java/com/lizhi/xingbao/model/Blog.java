package com.lizhi.xingbao.model;

import javax.persistence.*;


@Entity
@Table(name = "blog")
public class Blog{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer blogId;

    public Blog(){

    }

}

package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "tag")
public class Tag {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tagId;

    public Tag(){

    }
}

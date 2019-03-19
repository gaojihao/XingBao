package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer commentId;

    public Comment(){

    }
}

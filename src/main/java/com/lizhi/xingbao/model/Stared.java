package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "star")
public class Stared {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer starId;

    public Stared(){

    }
}

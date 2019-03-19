package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "collect")
public class Collect {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer collectId;

    public Collect(){

    }
}

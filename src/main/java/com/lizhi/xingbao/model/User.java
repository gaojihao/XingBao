package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    public User(){

    }
}

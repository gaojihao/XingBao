package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "video")
public class Video{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer videoId;

    public Video(){

    }
}

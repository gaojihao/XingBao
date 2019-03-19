package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "audio")
public class Audio {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer audioId;

    public Audio(){

    }
}

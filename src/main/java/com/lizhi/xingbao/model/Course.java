package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;

    public Course(){

    }
}

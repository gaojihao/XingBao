package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course extends BaseEntity{

    @Column(nullable = false,length = 50)
    private String title;

    @Column(nullable = false,length = 128)
    private String summary;

    private String desc;


}

package com.lizhi.xingbao.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "categoty")
public class CourseCategoty extends BaseEntity{


    public CourseCategoty(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

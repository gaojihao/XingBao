package com.lizhi.xingbao.entity;


import javax.persistence.*;

@Entity
@Table(name = "tag")
public class Tag extends BaseEntity{

    private static final long serialVersionUID = -4634788068753143904L;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.lizhi.xingbao.entity;


import javax.persistence.*;

@Entity
@Table(name = "category")
public class CourseCategory extends BaseEntity{


    private static final long serialVersionUID = 853305089047159145L;

    @Column(name = "name")
    private String name;

    @Column(name = "sub_title")
    private String subTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}

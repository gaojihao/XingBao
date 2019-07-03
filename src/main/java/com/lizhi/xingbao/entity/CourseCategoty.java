package com.lizhi.xingbao.entity;

import javax.persistence.*;

@Entity
@Table(name = "categoty")
public class CourseCategoty extends BaseEntity{


    private static final long serialVersionUID = 853305089047159145L;

    public CourseCategoty(String name) {
        this.name = name;
    }

    private String name;

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    private String subTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CourseCategoty{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", subTitle='" + subTitle + '\'' +
                '}';
    }
}

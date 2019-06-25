package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "tag")
public class Tag extends BaseEntity{

    private static final long serialVersionUID = -4634788068753143904L;
    private String name;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category")
@EqualsAndHashCode(callSuper = false)
public class CourseCategoty extends BaseEntity{


    private static final long serialVersionUID = 853305089047159145L;

    @Column(name = "name")
    private String name;

    @Column(name = "sub_title")
    private String subTitle;
}

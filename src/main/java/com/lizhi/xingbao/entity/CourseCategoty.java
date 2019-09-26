package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categoty")
@EqualsAndHashCode(callSuper = false)
public class CourseCategoty extends BaseEntity{


    private static final long serialVersionUID = 853305089047159145L;

    private String name;

    private String subTitle;
}

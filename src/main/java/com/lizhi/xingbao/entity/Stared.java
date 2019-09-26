package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "star")
@EqualsAndHashCode(callSuper = false)
public class Stared extends BaseEntity{

    private static final long serialVersionUID = -5917699228674048265L;
    /**
     * 所属个人
     */
    @Column(name = "user_id")
    private String userId;

    /**
     *所属课程
     */
    @Column(name = "course")
    private Integer course;
}

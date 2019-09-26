package com.lizhi.xingbao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "collect")
public class Collect extends BaseEntity{

    private static final long serialVersionUID = 2021114237133735688L;
    /**
     * 所属个人
     */
    @Column(name = "user_id")
    private String userId;

    /**
     *所属课程
     */
    @Column(name = "user_id")
    private Integer course;

}

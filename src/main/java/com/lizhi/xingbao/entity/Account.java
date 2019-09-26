package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "account")
@EqualsAndHashCode(callSuper = false)
public class Account extends BaseEntity {

    private static final long serialVersionUID = 3298587435085505430L;
    /**
     * 手机号
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 个人唯一标识
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 头像
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 是否为vip
     */
    @Column(name = "vip")
    private Boolean vip = false;

    /**
     * 性别
     */
    @Column(name = "sex")
    private String sex;

    /**
     * VIP等级
     */
    @Column(name = "level")
    private Integer level = 0;

}

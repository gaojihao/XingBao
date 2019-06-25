package com.lizhi.xingbao.dto;

import java.io.Serializable;

public class AccountDto implements Serializable {

    private static final long serialVersionUID = 5366396563939682455L;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 个人唯一标识
     */
    private String userId;

    /**
     * 头像
     */
    private String imgUrl;

    /**
     * 是否为vip
     */
    private Boolean vip;

    /**
     * 性别
     */
    private String sex;

    /**
     * VIP等级
     */
    private Integer level;
}

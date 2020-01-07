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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

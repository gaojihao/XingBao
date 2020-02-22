package com.lizhi.xingbao.dto;

import java.io.Serializable;

public class FeedBackDto implements Serializable {

    private int type;
    private String content;
    private String createUser;
    private String phone;
    private String name;

    private String createTime;

    private Integer id;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FeedBackDto{" +
                "type=" + type +
                ", content='" + content + '\'' +
                ", createUser='" + createUser + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", createTime='" + createTime + '\'' +
                ", id=" + id +
                '}';
    }
}

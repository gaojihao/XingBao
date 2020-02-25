package com.lizhi.xingbao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Aaron
 */
@Entity
@Table(name = "feedback")
public class FeedBack extends BaseEntity {

    @Column(name = "content")
    private String content;

    @Column(name = "type")
    private int type;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "fixed")
    private Boolean fixed = false;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Boolean getFixed() {
        return fixed;
    }

    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "content='" + content + '\'' +
                ", type=" + type +
                ", createUser='" + createUser + '\'' +
                ", fixed=" + fixed +
                '}';
    }
}

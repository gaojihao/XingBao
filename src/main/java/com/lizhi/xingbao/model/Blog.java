package com.lizhi.xingbao.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;



@Entity
@Table(name = "blog")
@EntityListeners(AuditingEntityListener.class)

public class Blog extends BaseEntity{

    private String title;
    private String content;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

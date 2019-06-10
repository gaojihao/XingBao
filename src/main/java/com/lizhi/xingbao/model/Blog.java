package com.lizhi.xingbao.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;



@Entity
@Table(name = "blog")
@EntityListeners(AuditingEntityListener.class)

public class Blog extends BaseEntity{

    @Column(nullable = false,length = 50)
    private String title;

    @Column(nullable = false,length = 128)
    private String summary;

    @Column(nullable = false)
    private String url;

    private Integer readNum = 0;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Blog(String title, String summary, String url) {
        this.title = title;
        this.summary = summary;
        this.url = url;
    }
}

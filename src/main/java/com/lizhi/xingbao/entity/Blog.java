package com.lizhi.xingbao.entity;

import javax.persistence.*;



@Entity
@Table(name = "blog")
public class Blog extends BaseEntity{

    private static final long serialVersionUID = -8386641090887103548L;

    @Column(nullable = false,length = 50)
    private String title;

    @Column(nullable = false,length = 128)
    private String summary;

    @Column(nullable = false)
    private String url;

    private Integer readNum = 0;

    private String content;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", url='" + url + '\'' +
                ", readNum=" + readNum +
                ", content='" + content + '\'' +
                '}';
    }
}

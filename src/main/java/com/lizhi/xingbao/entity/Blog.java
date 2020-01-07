package com.lizhi.xingbao.entity;


import javax.persistence.*;



@Entity
@Table(name = "blog")
public class Blog extends BaseEntity{

    private static final long serialVersionUID = -8386641090887103548L;

    @Column( name = "title")
    private String title;

    @Column(name = "summary")
    private String summary;

    @Column(name = "url")
    private String url;

    @Column(name = "read_num")
    private Integer readNum = 0;

    @Column(name = "content")
    private String content;

    @Column(name = "cover")
    private String cover;

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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}

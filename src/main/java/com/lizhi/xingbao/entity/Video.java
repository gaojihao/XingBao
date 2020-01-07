package com.lizhi.xingbao.entity;


import javax.persistence.*;

@Entity
@Table(name = "video")
public class Video extends BaseEntity{

    private static final long serialVersionUID = 5007825733826546423L;
    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 资源地址
     */
    @Column(name = "url")
    private String url;

    /**
     * 时长
     */
    @Column(name = "duration")
    private Integer duration;

    /**
     * 所属课程
     */
    @Column(name = "course")
    private Integer course;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }
}

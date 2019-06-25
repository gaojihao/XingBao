package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "video")
public class Video extends BaseEntity{

    private static final long serialVersionUID = 5007825733826546423L;
    /**
     * 标题
     */
    private String title;

    /**
     * 资源地址
     */
    private String url;

    /**
     * 时长
     */
    private Integer duration;

    /**
     * 所属课程
     */
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

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", duration=" + duration +
                ", course=" + course +
                '}';
    }
}

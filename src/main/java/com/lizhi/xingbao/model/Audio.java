package com.lizhi.xingbao.model;

import javax.persistence.*;

@Entity
@Table(name = "audio")
public class Audio extends BaseEntity{

    private static final long serialVersionUID = 2875226371844957533L;
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
        return "Audio{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", duration=" + duration +
                ", course=" + course +
                '}';
    }
}

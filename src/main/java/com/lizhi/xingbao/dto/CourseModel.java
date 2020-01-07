package com.lizhi.xingbao.dto;


import java.io.Serializable;

public class CourseModel implements Serializable {

    private static final long serialVersionUID = -7511830788904745018L;

    private String courseTitle;

    private Integer courseId;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}

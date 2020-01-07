package com.lizhi.xingbao.dto;


import java.io.Serializable;

public class CourseListDto implements Serializable {


    private static final long serialVersionUID = -5302500230967604217L;
    /**
     * 标题
     */
    private String courseName;

    private Integer courseId;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}


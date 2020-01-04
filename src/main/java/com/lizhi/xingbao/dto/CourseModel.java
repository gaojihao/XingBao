package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseModel implements Serializable {

    private static final long serialVersionUID = -7511830788904745018L;

    private String courseTitle;

    private Integer courseId;
}

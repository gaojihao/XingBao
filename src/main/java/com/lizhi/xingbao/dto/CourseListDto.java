package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseListDto implements Serializable {


    private static final long serialVersionUID = -5302500230967604217L;
    /**
     * 标题
     */
    private String courseName;

    private Integer courseId;

}


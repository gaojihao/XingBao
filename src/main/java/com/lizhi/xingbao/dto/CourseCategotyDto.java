package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseCategotyDto implements Serializable {
    private static final long serialVersionUID = 8282553267511034477L;

    /**
     * 标题
     */
    private String name;

    /**
     * 描述
     */
    private String desc;

    /**
     * 子标题
     */
    private String subTitle;

    private Integer categoryId;
}

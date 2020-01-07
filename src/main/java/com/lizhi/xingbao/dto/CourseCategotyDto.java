package com.lizhi.xingbao.dto;


import java.io.Serializable;

public class CourseCategotyDto implements Serializable {
    private static final long serialVersionUID = 8282553267511034477L;

    /**
     * 标题
     */
    private String name;

    private Integer categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}

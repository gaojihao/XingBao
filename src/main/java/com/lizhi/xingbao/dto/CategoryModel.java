package com.lizhi.xingbao.dto;


import java.io.Serializable;
import java.util.List;

public class CategoryModel implements Serializable {
    private static final long serialVersionUID = -2978497676465553934L;
    private String title;

    private Integer categoryId;

    private List<CourseModel> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<CourseModel> getList() {
        return list;
    }

    public void setList(List<CourseModel> list) {
        this.list = list;
    }
}

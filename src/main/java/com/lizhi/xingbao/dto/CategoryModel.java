package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CategoryModel implements Serializable {
    private static final long serialVersionUID = -2978497676465553934L;
    private String title;

    private Integer categoryId;

    private List<CourseModel> list;
}

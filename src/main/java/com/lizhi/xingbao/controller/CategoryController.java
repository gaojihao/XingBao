package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.model.CourseCategoty;
import com.lizhi.xingbao.respository.CourseCategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/category")
public class CategoryController extends BaseController{
    @Autowired
    private CourseCategoryRespository respository;

    @RequestMapping("saveCategory")
    public CourseCategoty saveCategory(String name){

        CourseCategoty categoty = new CourseCategoty();
        categoty.setName(name);

        return respository.save(categoty);
    }
}

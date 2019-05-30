package com.lizhi.xingbao.service;

import com.lizhi.xingbao.model.CourseCategoty;
import com.lizhi.xingbao.respository.CourseCategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CourseCategoryRespository categoryRespository;

    public void save(){
        CourseCategoty categoty = new CourseCategoty("123");

        categoryRespository.save(categoty);
    }
}

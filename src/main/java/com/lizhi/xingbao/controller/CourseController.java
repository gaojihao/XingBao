package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/course")
public class CourseController extends BaseController{

    @Autowired
    private CourseService courseService;
}

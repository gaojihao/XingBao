package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping("xingbao/api/v1/course")
public class CourseController extends BaseController{

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public Result add(@RequestBody CourseDto dto) {

        return Result.success(null);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Integer courseId) {

        return Result.success(null);
    }

    @PostMapping("/edit")
    public Result edit(@RequestBody CourseDto dto) {

        return Result.success(null);
    }

    @PostMapping("/list")
    public Result list(CourseDto dto, @RequestBody Pageable pageable) {

        return Result.success(null);
    }



}

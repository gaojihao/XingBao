package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CourseCategotyDto;
import com.lizhi.xingbao.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/category")
public class CategoryController extends BaseController{
    @Autowired
    private CourseService courseService;

    @RequestMapping("add")
    public void add(@RequestBody CourseCategotyDto dto){
        Result.success(null);
    }

    @RequestMapping("delete")
    public void delete(@RequestBody Integer Id){
        Result.success(null);
    }

    @RequestMapping("edit")
    public Result edit(@RequestBody CourseCategotyDto dto){
        return Result.success(null);
    }

    @RequestMapping("detail")
    public Result detail(@RequestBody Integer Id){
        return Result.success(null);
    }

    @RequestMapping("list")
    public Result list(){
        return Result.success(null);
    }

}

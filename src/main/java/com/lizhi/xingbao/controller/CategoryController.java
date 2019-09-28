package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CourseCategotyDto;
import com.lizhi.xingbao.service.CategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "课程分类controller",tags = "课程分类")
@RestController
@RequestMapping("xingbao/api/v1/category")
public class CategoryController extends BaseController{
    @Autowired
    private CategoryService service;

    @PostMapping("add")
    public Result add(@ModelAttribute CourseCategotyDto dto){
        service.createCategory(dto);
        return Result.success(null);
    }

    @GetMapping("delete")
    public Result delete(@RequestParam(name = "id") Integer Id){
        service.deleteCategoty(Id);
        return Result.success(null);
    }

    @PostMapping("edit")
    public Result edit(@ModelAttribute CourseCategotyDto dto){
        service.editCategory(dto);
        return Result.success(null);
    }

    @GetMapping("detail")
    public Result detail(@RequestParam(name = "id") Integer Id){

        return Result.success(service.categoryDetail(Id));
    }

    @GetMapping("list")
    public Result list(){

        return Result.success(service.getAllCategoty());
    }

}

package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CourseCategotyDto;
import com.lizhi.xingbao.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/category")
public class CategoryController extends BaseController{
    @Autowired
    private CategoryService service;

    @RequestMapping("add")
    public void add(@RequestBody CourseCategotyDto dto){
        service.createCategory(dto);
        Result.success(null);
    }

    @RequestMapping("delete")
    public void delete(@RequestBody Integer Id){
        service.deleteCategoty(Id);
        Result.success(null);
    }

    @RequestMapping("edit")
    public void edit(@RequestBody CourseCategotyDto dto){
        service.editCategory(dto);
        Result.success(null);
    }

    @RequestMapping("detail")
    public Result detail(@RequestBody Integer Id){
        return Result.success(service.categoryDetail(Id));
    }

    @RequestMapping("list")
    public Result list(){

        return Result.success(service.getAllCategoty());
    }

}

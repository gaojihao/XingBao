package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CourseCategotyDto;
import com.lizhi.xingbao.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "课程分类controller",tags = "课程分类")
@RestController
@RequestMapping("xingbao/api/v1/category")
public class CategoryController extends BaseController{
    @Autowired
    private CategoryService service;

    @ApiOperation(value = "添加分类", notes = "添加分类", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@RequestBody  CourseCategotyDto dto){
        service.createCategory(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "删除分类", notes = "删除分类", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestParam(name = "categoryId") Integer Id){
        service.deleteCategoty(Id);
        return Result.success(null);
    }

    @ApiOperation(value = "编辑分类", notes = "编辑分类", httpMethod = "POST")
    @PostMapping("edit")
    public Result edit(@RequestBody CourseCategotyDto dto){
        service.editCategory(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "获取分类详情", notes = "获取分类详情", httpMethod = "GET")
    @GetMapping("detail")
    public Result detail(@RequestParam(name = "categoryId") Integer Id){
        return Result.success(service.categoryDetail(Id));
    }

    @ApiOperation(value = "获取分类列表", notes = "获取分类列表", httpMethod = "GET")
    @GetMapping("list")
    public Result list(){

        return Result.success(service.getAllCategoty());
    }

}

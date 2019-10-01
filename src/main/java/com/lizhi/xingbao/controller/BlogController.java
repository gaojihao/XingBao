package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.BlogDto;
import com.lizhi.xingbao.service.BlogService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("xingbao/api/v1/blog")
public class BlogController extends BaseController{

    @Autowired
    private BlogService blogService;

    @ApiOperation(value = "添加文章", notes = "添加文章", httpMethod = "POST")
    @PostMapping("add")
    public Result createBlog(@ModelAttribute BlogDto blogDto){
        blogService.createBlog(blogDto);
        return Result.success(null);
    }

    @ApiOperation(value = "删除文章", notes = "删除文章", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestParam(name = "id") Integer Id){
        blogService.deleteBlog(Id);
        return Result.success(null);
    }

    @ApiOperation(value = "编辑文章", notes = "编辑文章", httpMethod = "POST")
    @PostMapping("edit")
    public Result edit(@ModelAttribute BlogDto blogDto){
        blogService.editBlog(blogDto);
        return Result.success(null);
    }

    @ApiOperation(value = "获取文章详情", notes = "获取文章详情", httpMethod = "GET")
    @GetMapping("detail")
    public Result detail(@RequestParam(name = "id") Integer Id){

        return Result.success(blogService.blogDetail(Id));
    }

    @ApiOperation(value = "获取文章列表", notes = "获取文章列表", httpMethod = "GET")
    @GetMapping("list")
    public Result list(BlogDto blogDto, @RequestBody Pageable pageable){

        return Result.success(blogService.queryBlog(pageable));
    }



}

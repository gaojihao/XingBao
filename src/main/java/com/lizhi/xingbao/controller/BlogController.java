package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.BlogDto;
import com.lizhi.xingbao.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("xingbao/api/v1/blog")
public class BlogController extends BaseController{

    @Autowired
    private BlogService blogService;

    @RequestMapping("/create")
    public Result createBlog(@RequestBody BlogDto blogDto){
        blogService.createBlog(blogDto);
        return Result.success(null);
    }

    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer Id){
        blogService.deleteBlog(Id);
        return Result.success(null);
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody BlogDto blogDto){
        blogService.editBlog(blogDto);
        return Result.success(null);
    }

    @RequestMapping("/detail")
    public Result detail(@RequestBody Integer Id){

        return Result.success(blogService.blogDetail(Id));
    }

    @RequestMapping("/list")
    public Result list(BlogDto blogDto, @RequestBody Pageable pageable){

        return Result.success(blogService.queryBlog(pageable));
    }



}

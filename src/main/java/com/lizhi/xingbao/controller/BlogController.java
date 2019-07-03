package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.respository.BlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("xingbao/api/v1/blog")
public class BlogController extends BaseController{

    @Autowired
    private BlogRespository dao;

    @RequestMapping("/create")
    public Result createBlog(String title, String content){

        return Result.fail("error");
    }
}

package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.BlogDto;
import com.lizhi.xingbao.respository.BlogRespository;
import com.lizhi.xingbao.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;


@RestController
@RequestMapping("xingbao/api/v1/blog")
public class BlogController extends BaseController{

    @Autowired
    private BlogService blogService;

    @RequestMapping("/create")
    public void createBlog(@RequestBody BlogDto blogDto){

        Result.success(null);
    }

    @RequestMapping("/delete")
    public void delete(@RequestBody Integer Id){

        Result.success(null);
    }

    @RequestMapping("/edit")
    public void edit(@RequestBody BlogDto blogDto){

        Result.success(null);
    }

    @RequestMapping("/detail")
    public Result detail(@RequestBody Integer Id){

        return Result.success(null);
    }

    @RequestMapping("/list")
    public Result list( BlogDto blogDto,@RequestBody Pageable pageable){

        return Result.success(null);
    }



}

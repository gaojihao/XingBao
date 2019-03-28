package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.model.Blog;
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
    public Blog createBlog(String title,String content){
        Blog blog = new Blog();

        blog.setContent(content);
        blog.setTitle(title);

        return dao.saveAndFlush(blog);
    }
}

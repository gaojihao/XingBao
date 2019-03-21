package com.lizhi.xingbao.service;

import com.lizhi.xingbao.model.Blog;
import com.lizhi.xingbao.respository.BlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    @Autowired
    BlogRespository respository;

    public Blog createBlog(String title,String content){
        return null;
    }
}

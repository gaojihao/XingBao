package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dto.BlogDto;
import com.lizhi.xingbao.respository.BlogRespository;
import com.lizhi.xingbao.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BlogService")
public class BlogServiceImpl implements BlogService {
    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private BlogRespository blogRespository;

    @Override
    public void createBlog(BlogDto dto) {

    }

    @Override
    public void editBlog(BlogDto dto){

    }

    @Override
    public BlogDto blogDetail(Integer Id){

    }

    @Override
    public void deleteBlog(Integer Id){

    }

    @Override
    public List<BlogDto> getAllBlog(){

    }

    @Override
    public List<BlogDto> queryBlog(Pageable pageable){

    }
}

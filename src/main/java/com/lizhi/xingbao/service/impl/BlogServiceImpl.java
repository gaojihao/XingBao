package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.BlogDto;
import com.lizhi.xingbao.entity.Blog;
import com.lizhi.xingbao.respository.BlogRespository;
import com.lizhi.xingbao.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("BlogService")
public class BlogServiceImpl implements BlogService {
    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private BlogRespository blogRespository;

    @Override
    public void createBlog(BlogDto dto) {
        if (blogRespository.findByUrl(dto.getUrl()) != null){
            throw new ParamException("url 已存在");
        }

        Blog blog = new Blog();
        blog.setContent(dto.getContent());
        blog.setReadNum(0);
        blog.setSummary(dto.getSummary());
        blog.setTitle(dto.getTitle());

        blogRespository.save(blog);

    }

    @Override
    public void editBlog(BlogDto dto){
        Blog blog = blogRespository.findByUrl(dto.getUrl());

        blog.setContent(dto.getContent());
        blog.setReadNum(dto.getReadNum());
        blog.setSummary(dto.getSummary());
        blog.setTitle(dto.getTitle());

        blogRespository.save(blog);
    }

    @Override
    public BlogDto blogDetail(Integer Id){
        Optional<Blog> optional = blogRespository.findById(Id);

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Blog blog = optional.get();

        BlogDto dto = new BlogDto();
        dto.setBlogId(blog.getId());
        dto.setContent(blog.getContent());
        dto.setReadNum(blog.getReadNum());
        dto.setSummary(blog.getSummary());
        dto.setTitle(blog.getTitle());
        dto.setUrl(blog.getUrl());
        return dto;
    }

    @Override
    public void deleteBlog(Integer Id){
        blogRespository.deleteById(Id);
    }

    @Override
    public List<BlogDto> getAllBlog(){
        List<Blog> list = blogRespository.findAll();
        List<BlogDto> dtoList = new ArrayList<>();

        for (Blog blog : list){
            BlogDto dto = new BlogDto();
            dto.setUrl(blog.getUrl());
            dto.setTitle(blog.getTitle());
            dto.setSummary(blog.getSummary());
            dto.setReadNum(blog.getReadNum());
            dto.setContent(blog.getContent());
            dto.setBlogId(blog.getId());

            dtoList.add(dto);
        }

        return dtoList;
    }

    @Override
    public List<BlogDto> queryBlog(Pageable pageable){
        List<Blog> list = blogRespository.findAll(pageable).getContent();
        List<BlogDto> dtoList = new ArrayList<>();

        for (Blog blog : list){
            BlogDto dto = new BlogDto();
            dto.setUrl(blog.getUrl());
            dto.setTitle(blog.getTitle());
            dto.setSummary(blog.getSummary());
            dto.setReadNum(blog.getReadNum());
            dto.setContent(blog.getContent());
            dto.setBlogId(blog.getId());

            dtoList.add(dto);
        }

        return dtoList;
    }
}

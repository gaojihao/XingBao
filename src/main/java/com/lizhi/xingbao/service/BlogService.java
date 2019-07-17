package com.lizhi.xingbao.service;

import com.lizhi.xingbao.dto.BlogDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    void createBlog(BlogDto dto);

    void editBlog(BlogDto dto);

    BlogDto blogDetail(Integer Id);

    void deleteBlog(Integer Id);

    List<BlogDto> getAllBlog();

    List<BlogDto> queryBlog(Pageable pageable);
}

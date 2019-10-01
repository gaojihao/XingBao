package com.lizhi.xingbao.service;

import com.lizhi.xingbao.dto.BlogDto;
import com.lizhi.xingbao.request.BlogQueryCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    /**
     * 创建blog
     * @param dto
     */
    void createBlog(BlogDto dto);

    /**
     * 修改blog
     * @param dto
     */
    void editBlog(BlogDto dto);

    /**
     * blog详情
     * @param Id
     * @return
     */
    BlogDto blogDetail(Integer Id);

    /**
     * 删除blog
     * @param Id
     */
    void deleteBlog(Integer Id);

    /**
     * 获取所有blog
     * @return
     */
    List<BlogDto> getAllBlog();

    /**
     * 分页查询
     * @param criteria 条件查询
     * @param pageable
     * @return
     */
    Object queryBlog(BlogQueryCriteria criteria, Pageable pageable);
}

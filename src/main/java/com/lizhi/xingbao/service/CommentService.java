package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.CommentDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentService {

    /**
     * 创建评论
     * @param dto
     */
    void createComment(CommentDto dto);

    /**
     * 评论详情
     * @param id 评论Id
     * @return
     */
    CommentDto commentDetail(Integer id);

    /**
     * 删除评论
     * @param id
     */
    void deleteDetail(Integer id);

    /**
     * 分页获取课程评论
     * @param courseId 课程Id
     * @param pageable 分页信息
     * @return
     */
    List<CommentDto> findAllBy(Integer courseId, Pageable pageable);
}

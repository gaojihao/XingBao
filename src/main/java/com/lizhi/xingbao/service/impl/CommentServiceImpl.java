package com.lizhi.xingbao.service.impl;
import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.CommentDto;
import com.lizhi.xingbao.entity.Comment;
import com.lizhi.xingbao.respository.CommentRespository;
import com.lizhi.xingbao.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("CommentService")
public class CommentServiceImpl implements CommentService {
    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImpl.class);

    @Autowired
    private CommentRespository respository;

    @Override
    public void createComment(CommentDto dto){

        if (dto.getContent() == null ||
                dto.getCourse() == null ||
                dto.getLevel() ==null ||
                dto.getUserId() == null){
            throw new ParamException("参数错误");
        }

        Comment comment = new Comment();
        comment.setContent(dto.getContent());
        comment.setCourse(dto.getCourse());
        comment.setLevel(dto.getLevel());
        comment.setUserId(dto.getUserId());

        respository.save(comment);

    }

    @Override
    public CommentDto commentDetail(Integer id){
        Optional<Comment> optional = respository.findById(id);

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Comment comment = optional.get();

        CommentDto dto = new CommentDto();
        dto.setContent(comment.getContent());
        dto.setCourse(comment.getCourse());
        dto.setLevel(comment.getLevel());
        dto.setUserId(comment.getUserId());
        dto.setCommentId(comment.getId());

        return dto;
    }

    @Override
    public void deleteDetail(Integer id){
        respository.deleteById(id);
    }

    @Override
    public List<CommentDto> findAllBy(Integer courseId, Pageable pageable){
        List<Comment> list = respository.findAllByCourse(courseId, pageable);
        List<CommentDto> dtoList = new ArrayList<>();

        for (Comment comment : list){
            CommentDto dto = new CommentDto();
            dto.setContent(comment.getContent());
            dto.setCourse(comment.getCourse());
            dto.setLevel(comment.getLevel());
            dto.setUserId(comment.getUserId());
            dto.setCommentId(comment.getId());

            dtoList.add(dto);
        }

        return dtoList;
    }
}

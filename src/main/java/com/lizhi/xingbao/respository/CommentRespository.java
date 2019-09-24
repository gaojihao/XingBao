package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRespository extends JpaRepository<Comment,Integer> {

    List<Comment> findAllByCourse(Integer courseId, Pageable pageable);
}

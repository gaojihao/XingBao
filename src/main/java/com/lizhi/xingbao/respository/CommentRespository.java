package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRespository extends JpaRepository<Comment,Integer> {
}

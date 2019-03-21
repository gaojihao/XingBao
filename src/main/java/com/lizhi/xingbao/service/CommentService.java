package com.lizhi.xingbao.service;

import com.lizhi.xingbao.respository.CommentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    CommentRespository respository;
}

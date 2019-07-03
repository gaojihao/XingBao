package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.respository.CommentRespository;
import com.lizhi.xingbao.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CommentService")
public class CommentServiceImpl implements CommentService {
    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImpl.class);

    @Autowired
    private CommentRespository commentRespository;
}

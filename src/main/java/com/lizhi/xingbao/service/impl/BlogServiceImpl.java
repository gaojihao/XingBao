package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dao.BlogDao;
import com.lizhi.xingbao.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BlogService")
public class BlogServiceImpl implements BlogService {
    private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private BlogDao blogDao;
}

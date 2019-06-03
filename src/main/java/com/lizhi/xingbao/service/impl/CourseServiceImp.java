package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dao.CourseDao;
import com.lizhi.xingbao.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CourseService")
public class CourseServiceImp implements CourseService {
    private static final Logger logger = LoggerFactory.getLogger(CourseServiceImp.class);

    @Autowired
    private CourseDao courseDao;

}

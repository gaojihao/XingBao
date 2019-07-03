package com.lizhi.xingbao.dao;

import com.lizhi.xingbao.respository.CourseRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseDao {

    private static final Logger logger = LoggerFactory.getLogger(CourseDao.class);

    @Autowired
    private CourseRespository courseRespository;

    
}

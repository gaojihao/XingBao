package com.lizhi.xingbao.dao;

import com.lizhi.xingbao.respository.CourseCategoryRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseCategoryDao {

    private static final Logger logger = LoggerFactory.getLogger(CourseCategoryDao.class);

    @Autowired
    CourseCategoryRespository courseCategoryRespository;
}

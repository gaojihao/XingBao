package com.lizhi.xingbao.dao;

import com.lizhi.xingbao.respository.TagRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TagDao {

    private static final Logger logger = LoggerFactory.getLogger(TagDao.class);

    @Autowired
    TagRespository tagRespository;
}

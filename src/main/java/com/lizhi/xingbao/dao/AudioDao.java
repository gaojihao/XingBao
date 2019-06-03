package com.lizhi.xingbao.dao;

import com.lizhi.xingbao.respository.AudioRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AudioDao {
    private static final Logger logger = LoggerFactory.getLogger(AudioDao.class);

    @Autowired
    private AudioRespository audioRespository;

}

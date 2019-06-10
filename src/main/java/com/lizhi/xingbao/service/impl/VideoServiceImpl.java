package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dao.VideoDao;
import com.lizhi.xingbao.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("VideoService")
public class VideoServiceImpl implements VideoService {
    private static final Logger logger = LoggerFactory.getLogger(VideoServiceImpl.class);

    @Autowired
    private VideoDao videoDao;

}

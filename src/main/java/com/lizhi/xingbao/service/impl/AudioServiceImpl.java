package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.respository.AudioRespository;
import com.lizhi.xingbao.service.AudioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AudioService")
public class AudioServiceImpl implements AudioService {
    private static final Logger logger = LoggerFactory.getLogger(AudioServiceImpl.class);

    @Autowired
    private AudioRespository respository;
}

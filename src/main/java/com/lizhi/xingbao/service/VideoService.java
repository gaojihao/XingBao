package com.lizhi.xingbao.service;

import com.lizhi.xingbao.respository.VideoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    VideoRespository respository;
}

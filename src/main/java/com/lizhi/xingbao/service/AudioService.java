package com.lizhi.xingbao.service;

import com.lizhi.xingbao.respository.AudioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudioService {

    @Autowired
    AudioRespository respository;
}

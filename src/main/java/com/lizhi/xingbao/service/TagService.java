package com.lizhi.xingbao.service;

import com.lizhi.xingbao.respository.TagRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    @Autowired
    TagRespository respository;
}
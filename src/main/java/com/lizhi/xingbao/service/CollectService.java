package com.lizhi.xingbao.service;

import com.lizhi.xingbao.respository.CollectRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectService {

    @Autowired
    CollectRespository respository;
}

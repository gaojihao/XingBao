package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.respository.CollectRespository;
import com.lizhi.xingbao.service.CollectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CollectService")
public class CollectServiceImpl implements CollectService {
    private static final Logger logger = LoggerFactory.getLogger(CollectServiceImpl.class);

    @Autowired
    private CollectRespository collectRespository;
}

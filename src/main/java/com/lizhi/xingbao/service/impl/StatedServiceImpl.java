package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.respository.StaredRespository;
import com.lizhi.xingbao.service.StatedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StatedService")
public class StatedServiceImpl implements StatedService {
    private static final Logger logger = LoggerFactory.getLogger(StatedServiceImpl.class);

    @Autowired
    private StaredRespository staredRespository;

}

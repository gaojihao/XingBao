package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.respository.TagRespository;
import com.lizhi.xingbao.service.TagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TagService")
public class TagServiceImpl implements TagService {
    private static final Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);

    @Autowired
    private TagRespository tagRespository;
}

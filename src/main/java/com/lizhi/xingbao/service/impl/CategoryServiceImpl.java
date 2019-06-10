package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dao.CourseCategoryDao;
import com.lizhi.xingbao.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CourseCategoryDao courseCategoryDao;
}

package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.entity.Course;
import com.lizhi.xingbao.respository.CourseRespository;
import com.lizhi.xingbao.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service("CourseService")
public class CourseServiceImp implements CourseService {
    private static final Logger logger = LoggerFactory.getLogger(CourseServiceImp.class);

    @Autowired
    private CourseRespository courseRespository;

    @Override
    public List<CourseDto> queryAll(Course course, Pageable pageable) {
        return null;
    }

    @Override
    public CourseDto findOne(Integer id) {
        return null;
    }

    @Override
    public CourseDto add(Course course) {
        return null;
    }

}

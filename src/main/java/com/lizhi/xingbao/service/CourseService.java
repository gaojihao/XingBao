package com.lizhi.xingbao.service;

import com.lizhi.xingbao.respository.CourseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRespository respository;
}

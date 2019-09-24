package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.entity.Course;

import java.awt.print.Pageable;
import java.util.List;

public interface CourseService {

    List<CourseDto> queryAll(Course course, Pageable pageable);

    CourseDto findOne(Integer id);

    CourseDto add(Course course);

}

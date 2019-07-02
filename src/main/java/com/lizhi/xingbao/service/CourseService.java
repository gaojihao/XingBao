package com.lizhi.xingbao.service;


import com.lizhi.xingbao.model.Course;

import java.awt.print.Pageable;
import java.util.List;

public interface CourseService {

    List<Course> queryAll(Course course, Pageable pageable);

    Course findOne(Integer id);

    Course add(Course course);



}

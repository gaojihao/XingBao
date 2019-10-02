package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.request.CourseQueryCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {

    Object queryAll(CourseQueryCriteria criteria, Pageable pageable);

    CourseDto findOne(Integer id);

    void add(CourseDto dto);

}

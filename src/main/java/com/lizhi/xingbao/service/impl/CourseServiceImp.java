package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.entity.Course;
import com.lizhi.xingbao.request.CourseQueryCriteria;
import com.lizhi.xingbao.respository.CourseRespository;
import com.lizhi.xingbao.service.CourseService;
import com.lizhi.xingbao.utils.PageUtil;
import com.lizhi.xingbao.utils.QueryHelp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service("CourseService")
public class CourseServiceImp implements CourseService {
    private static final Logger logger = LoggerFactory.getLogger(CourseServiceImp.class);

    @Autowired
    private CourseRespository courseRespository;

    @Override
    public Object getCourseList(CourseQueryCriteria criteria, Pageable pageable) {
        Page<Course> page = courseRespository.findAll(((root, criteriaQuery, cb) -> QueryHelp.getPredicate(root, criteria, cb)),pageable);
        return PageUtil.toPage(page.map(this::toDto));
    }

    @Override
    public CourseDto courseDetail(Integer id) {
        Optional<Course> optional = courseRespository.findById(id);
        if (!optional.isPresent()) {
            throw new ParamException("不存在");
        }
        Course course = optional.get();
        return toDto(course);
    }


    @Override
    public void add(CourseDto dto) {
        if (courseRespository.findByTitle(dto.getTitle()) != null) {
            throw new ParamException("课程已存在");
        }
        courseRespository.save(toEntity(dto));

    }

    private Course toEntity(CourseDto dto){
        Course course = new Course();
        course.setCategory(dto.getCategory());
        course.setBuyCount(0);
        course.setCategoryName(course.getCategoryName());
        course.setCoverImage(dto.getCoverImage());
        course.setDesc(dto.getDesc());
        course.setType(dto.getType());
        course.setGrade(dto.getGrade());
        course.setPrice(dto.getPrice());
        course.setRealPrice(dto.getRealPrice());
        course.setSubTitle(dto.getSubTitle());
        course.setSummary(dto.getSummary());
        course.setTitle(dto.getTitle());

        return course;
    }

    @Override
    public void deleteCourse(Integer Id) {
        courseRespository.deleteById(Id);
    }

    @Override
    public void editCourse(CourseDto dto) {
        Optional<Course> optional = courseRespository.findById(dto.getCourseId());
        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Course course = optional.get();
        course.setCategory(dto.getCategory());
        course.setBuyCount(dto.getBuyCount());
        course.setCategoryName(course.getCategoryName());
        course.setCoverImage(dto.getCoverImage());
        course.setDesc(dto.getDesc());
        course.setType(dto.getType());
        course.setGrade(dto.getGrade());
        course.setPrice(dto.getPrice());
        course.setRealPrice(dto.getRealPrice());
        course.setSubTitle(dto.getSubTitle());
        course.setSummary(dto.getSummary());
        course.setTitle(dto.getTitle());

        courseRespository.save(course);
    }

    private CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        return dto;
    }

}

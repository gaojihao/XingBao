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
        course.setCoverImage(dto.getCoverImage());
        course.setDesc(dto.getDesc());
        course.setType(dto.getType());
        course.setGrade(0);
        course.setPrice(dto.getPrice());
        course.setRealPrice(dto.getRealPrice());
        course.setSubTitle(dto.getSubTitle());
        course.setSummary(dto.getSummary());
        course.setCategoryName("test");
        course.setTitle(dto.getTitle());
        course.setPublished(false);

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
        course.setCoverImage(dto.getCoverImage());
        course.setDesc(dto.getDesc());
        course.setType(dto.getType());
        course.setPrice(dto.getPrice());
        course.setRealPrice(dto.getRealPrice());
        course.setSubTitle(dto.getSubTitle());
        course.setSummary(dto.getSummary());
        course.setTitle(dto.getTitle());
        course.setPublished(dto.getPublished());

        courseRespository.save(course);
    }

    private CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setCategory(course.getCategory());
        dto.setBuyCount(course.getBuyCount());
        dto.setCourseId(course.getId());
        dto.setCoverImage(course.getCoverImage());
        dto.setDesc(course.getDesc());
        dto.setGrade(course.getGrade());
        dto.setPrice(course.getPrice());
        dto.setRealPrice(course.getRealPrice());
        dto.setSubTitle(course.getSubTitle());
        dto.setTitle(course.getTitle());
        dto.setType(course.getType());
        dto.setSummary(course.getSummary());
        return dto;
    }

}

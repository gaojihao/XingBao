package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.request.CourseQueryCriteria;
import org.springframework.data.domain.Pageable;

public interface CourseService {

    /**
     * 添加课程
     * @param dto
     */
    void add(CourseDto dto);

    /**
     * 课程详情
     * @param id
     * @return
     */
    CourseDto courseDetail(Integer id);

    /**
     * 修改课程信息
     * @param dto
     */
    void editCourse(CourseDto dto);

    /**
     * 删除课程
     * @param Id
     */
    void deleteCourse(Integer Id);


    /**
     * 更新发布状态
     * @param Id
     * @param publish
     */
    void updatePublishState(Integer Id,Boolean publish);

    /**
     * 获取课程列表
     * @param criteria 查询条件
     * @param pageable 分页
     * @return
     */
    Object getCourseList(CourseQueryCriteria criteria, Pageable pageable);

}

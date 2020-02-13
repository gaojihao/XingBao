package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.request.CourseQueryCriteria;
import com.lizhi.xingbao.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@Api(tags = "课程")
@RestController
@RequestMapping("course")
public class CourseController extends BaseController{

    @Autowired
    private CourseService courseService;

    @ApiOperation(value = "添加课程", notes = "添加课程", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@RequestBody CourseDto dto) {
        courseService.add(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "删除课程", notes = "删除课程", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestParam(name = "courseId") Integer Id) {
        courseService.deleteCourse(Id);
        return Result.success(null);
    }

    @ApiOperation(value = "编辑课程", notes = "编辑课程", httpMethod = "POST")
    @PostMapping("edit")
    public Result edit(@RequestBody CourseDto dto) {
        courseService.editCourse(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "更新课程发布状态", notes = "更新课程发布状态", httpMethod = "POST")
    @PostMapping("update/publish")
    public Result updatePublishState(@RequestParam(name = "courseId") Integer Id,
                                     @RequestParam(name = "published") Boolean published) {
        courseService.updatePublishState(Id, published);
        return Result.success(null);
    }

    @ApiOperation(value = "获取课程详情", notes = "获取课程详情", httpMethod = "GET")
    @GetMapping("detail")
    public Result detail(@RequestParam(name = "courseId") Integer Id) {
        return Result.success(courseService.courseDetail(Id));
    }

    @ApiOperation(value = "获取课程列表", notes = "获取课程列表", httpMethod = "GET")
    @GetMapping("list")
    public Result list(CourseQueryCriteria criteria, Pageable pageable) {

        return Result.success(courseService.getCourseList(criteria,pageable));
    }

    @ApiOperation(value = "app获取已发布课程列表", notes = "app获取已发布课程列表", httpMethod = "GET")
    @GetMapping("app/list")
    public Result courseListOfPublish(Pageable pageable) {

        return Result.success(courseService.courseListOfPublished(pageable));
    }

}

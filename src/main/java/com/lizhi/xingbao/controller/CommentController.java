package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CommentDto;
import com.lizhi.xingbao.request.CommentRequest;
import com.lizhi.xingbao.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@Api(tags = "评论")
@RestController
@RequestMapping("xingbao/api/v1/comment")
public class CommentController extends BaseController{

    @Autowired
    private CommentService commentService;

    @ApiOperation(value = "评论", notes = "评论", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@RequestBody CommentDto dto) {
        commentService.createComment(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "获取评论列表", notes = "获取评论列表", httpMethod = "GET")
    @GetMapping("list")
    public Result list(Integer courseId, Pageable pageable){

        return Result.success(commentService.findAllBy(courseId,pageable));
    }
}

package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.CommentDto;
import com.lizhi.xingbao.request.CommentRequest;
import com.lizhi.xingbao.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/comment")
public class CommentController extends BaseController{

    @Autowired
    private CommentService commentService;

    @RequestMapping("add")
    public Result add(@RequestBody CommentDto dto) {
        commentService.createComment(dto);
        return Result.success(null);
    }

    @RequestMapping("delete")
    public Result delete(@RequestBody Integer Id) {
        commentService.deleteDetail(Id);
        return Result.success(null);
    }

    @RequestMapping("list")
    public Result list(@RequestBody Integer courseId, @RequestBody Pageable pageable){

        return Result.success(commentService.findAllBy(courseId,pageable));
    }
}

package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.request.CommentRequest;
import com.lizhi.xingbao.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping("xingbao/api/v1/comment")
public class CommentController extends BaseController{

    @Autowired
    private CommentService commentService;

    @RequestMapping("add")
    public void add(@RequestBody CommentRequest request) {
        Result.success(null);
    }

    @RequestMapping("delete")
    public void delete(@RequestBody Integer Id) {
        Result.success(null);
    }

    @RequestMapping("list")
    public Result list(CommentRequest request, @RequestBody Pageable pageable){
        return Result.success(null);
    }

    @RequestMapping("course/comment")
    public Result courseComment(@RequestBody CommentRequest request){
        return Result.success(null);
    }


}

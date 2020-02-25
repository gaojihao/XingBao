package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.service.FeedBackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Aaron
 */
@Api(tags = "消息相关接口")
@RestController
@RequestMapping("message")
public class MessageController extends BaseController {

    @Autowired
    private FeedBackService service;

    @ApiOperation(value = "意见反馈", notes = "意见反馈", httpMethod = "POST")
    @PostMapping("feedBack/add")
    public Result Add(HttpServletRequest request, @RequestParam int type, @RequestParam String content){
        String token = request.getHeader("token");
        if (token == null){
            return Result.fail("请先登录");
        }
        service.add(token,type,content);
        return Result.success(null);
    }

    @ApiOperation(value = "意见反馈列表", notes = "意见反馈列表", httpMethod = "GET")
    @GetMapping("feedBack/list")
    public Result allFeedBack(HttpServletRequest request){
        return Result.success(service.getAllFeedBack());
    }


}

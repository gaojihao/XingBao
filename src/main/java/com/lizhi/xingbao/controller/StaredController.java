package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.request.StarRequest;
import com.lizhi.xingbao.service.StatedService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "赞")
@RestController
@RequestMapping("star")
public class StaredController extends BaseController{

    @Autowired
    private StatedService statedService;

    @ApiOperation(value = "点赞", notes = "点赞", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@RequestBody StarRequest request) {
        if (request.getCourseId() == null || request.getUserId() == null ){
            return Result.fail("参数错误");
        }
        statedService.updateStar(request);
        return Result.success(null);
    }

    @ApiOperation(value = "取消收藏", notes = "取消收藏", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestBody StarRequest request) {
        if (request.getCourseId() == null || request.getUserId() == null ){
            return Result.fail("参数错误");
        }
        statedService.cancelStar(request);
        return Result.success(null);
    }
}

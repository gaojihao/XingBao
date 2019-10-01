package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.request.CollectRequest;
import com.lizhi.xingbao.service.CollectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@Api(tags = "收藏")
@RestController
@RequestMapping("xingbao/api/v1/collect")
public class CollectController extends BaseController{

    @Autowired
    private CollectService collectService;

    @ApiOperation(value = "收藏", notes = "收藏", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@ModelAttribute CollectRequest request) {
        if (request.getCourseId() == null || request.getUserId() == null ){
            return Result.fail("参数错误");
        }

        collectService.updateCollect(request);

        return Result.success(null);
    }

    @ApiOperation(value = "取消收藏", notes = "取消收藏", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@ModelAttribute CollectRequest request) {
        if (request.getCourseId() == null || request.getUserId() == null ){
            return Result.fail("参数错误");
        }
        collectService.cancelCollect(request);
        return Result.success(null);
    }

}

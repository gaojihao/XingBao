package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.request.StarRequest;
import com.lizhi.xingbao.service.StatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/star")
public class StaredController extends BaseController{

    @Autowired
    private StatedService statedService;

    @PostMapping("/add")
    public void add(@RequestBody StarRequest request) {
        Result.success(null);
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody StarRequest request) {
        return Result.success(null);
    }

    @PostMapping("/list")
    public Result list(@RequestBody StarRequest request) {
        return Result.success(null);
    }


}

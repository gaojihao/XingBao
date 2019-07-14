package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/audio")
public class AudioController extends BaseController{

    @Autowired
    private AudioService service;

    @PostMapping("/add")
    public void add(@RequestBody AudioDto audio) {
        Result.success(null);
    }

    @PostMapping("/edit")
    public void edit(@RequestBody AudioDto dto){
        Result.success(null);
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody Integer id){
        return Result.success(null);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer id){
        Result.success(null);
    }

    @PostMapping("/list")
    public Result query(@RequestBody Integer course) {
        return Result.success(null);
    }

}

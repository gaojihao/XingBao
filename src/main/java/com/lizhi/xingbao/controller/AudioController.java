package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.respository.AudioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/audio")
public class AudioController extends BaseController{

    @Autowired
    AudioRespository respository;

    @PostMapping("/add")
    public Result add() {
        return Result.success(null);
    }
}

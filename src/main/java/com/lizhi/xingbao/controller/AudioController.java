package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.entity.Audio;
import com.lizhi.xingbao.respository.AudioRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping("xingbao/api/v1/audio")
public class AudioController extends BaseController{

    @Autowired
    AudioRespository respository;

    @PostMapping("/add")
    public void add(@RequestBody Audio audio) {
        Result.success(null);
    }

    @PostMapping("/edit")
    public Result edit(@RequestBody Audio audio){
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
    public Result query( Audio audio, @RequestBody Pageable pageable) {
        return Result.success(null);
    }


}

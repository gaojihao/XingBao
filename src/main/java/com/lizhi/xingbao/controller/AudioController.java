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
    public Result add(@RequestBody AudioDto audio) {
        service.createAudio(audio);
        return Result.success(null);
    }

    @PostMapping("/edit")
    public Result edit(@RequestBody AudioDto dto){
        service.editAudio(dto);
        return Result.success(null);
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody Integer id){

        return Result.success(service.audioDetail(id));
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Integer id){
        service.deleteAudio(id);
        return Result.success(null);
    }

    @PostMapping("/list")
    public Result query(@RequestBody Integer course) {

        return Result.success(service.getAudioList(course));
    }

}

package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.request.AudioQueryCriteria;
import com.lizhi.xingbao.service.AudioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@Api(tags = "音频")
@RestController
@RequestMapping("xingbao/api/v1/audio")
public class AudioController extends BaseController{

    @Autowired
    private AudioService service;

    @ApiOperation(value = "添加音频", notes = "添加音频", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@ModelAttribute AudioDto audio) {
        service.createAudio(audio);
        return Result.success(null);
    }

    @ApiOperation(value = "删除音频", notes = "删除音频", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestParam(name = "id") Integer Id){
        service.deleteAudio(Id);
        return Result.success(null);
    }

    @ApiOperation(value = "编辑音频", notes = "编辑音频", httpMethod = "POST")
    @PostMapping("edit")
    public Result edit(@ModelAttribute AudioDto audio){
        service.editAudio(audio);
        return Result.success(null);
    }

    @ApiOperation(value = "获取音频详情", notes = "获取音频详情", httpMethod = "GET")
    @GetMapping("detail")
    public Result detail(@RequestParam(name = "id") Integer Id){
        return Result.success(service.audioDetail(Id));
    }

    @ApiOperation(value = "获取音频列表", notes = "获取音频列表", httpMethod = "GET")
    @GetMapping("list")
    public Result query(AudioQueryCriteria criteria, Pageable pageable) {
        return Result.success(service.getAudioList(criteria, pageable));
    }

}

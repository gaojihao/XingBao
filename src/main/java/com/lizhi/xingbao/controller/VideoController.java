package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.VideoDto;
import com.lizhi.xingbao.entity.Video;
import com.lizhi.xingbao.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/video")
public class VideoController extends BaseController{
    @Autowired
    VideoService videoService;

    @PostMapping("/add")
    public void add(@RequestBody VideoDto dto) {
        videoService.createVideo(dto);
        Result.success(null);
    }

    @PostMapping("/edit")
    public void edit(@RequestBody VideoDto dto){
        videoService.editVideo(dto);
        Result.success(null);
    }

    @PostMapping("/detail")
    public Result detail(@RequestBody Integer id){
        return Result.success(videoService.videoDetail(id));
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer id){
        videoService.deleteVideo(id);
        Result.success(null);
    }

    @PostMapping("/list")
    public Result query(@RequestBody Integer course) {
        return Result.success(videoService.getVideoList(course));
    }
}

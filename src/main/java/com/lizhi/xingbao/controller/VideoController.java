package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.VideoDto;
import com.lizhi.xingbao.entity.Video;
import com.lizhi.xingbao.request.VideoQueryCriteria;
import com.lizhi.xingbao.service.VideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "视频")
@RestController
@RequestMapping("xingbao/api/v1/video")
public class VideoController extends BaseController{
    @Autowired
    VideoService videoService;

    /**
     * 上传视频
     * @param file
     * @return
     */
    @ApiOperation(value = "上传视频", notes = "上传视频", httpMethod = "POST")
    @PostMapping(value = "/upload")
    public Result upload(@RequestParam MultipartFile file, HttpServletRequest request) {
        String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
        String filename = file.getOriginalFilename();
        String filePath = request.getScheme() + "://" +
                request.getServerName() + ":"
                + request.getServerPort()
                + "/uploadFile/" + filename;
        return  Result.success(videoService.upload(file));
    }

    @ApiOperation(value = "添加视频", notes = "添加视频", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@RequestBody VideoDto dto) {
        videoService.createVideo(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "删除视频", notes = "删除视频", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestParam(name = "videoId") Integer Id){
        videoService.deleteVideo(Id);
        return Result.success(null);
    }

    @ApiOperation(value = "编辑视频", notes = "编辑视频", httpMethod = "POST")
    @PostMapping("edit")
    public Result edit(@RequestBody VideoDto dto){
        videoService.editVideo(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "获取视频详情", notes = "获取视频详情", httpMethod = "GET")
    @GetMapping("detail")
    public Result detail(@RequestParam(name = "videoId") Integer Id){

        return Result.success(videoService.videoDetail(Id));
    }

    @ApiOperation(value = "获取视频列表", notes = "获取视频列表", httpMethod = "GET")
    @GetMapping("list")
    public Result query(VideoQueryCriteria criteria, Pageable pageable) {

        return Result.success(videoService.getVideoList(criteria, pageable));
    }
}

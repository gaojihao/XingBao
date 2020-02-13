package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.service.PictureQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "图片")
@RestController
@RequestMapping("picture")
public class PictureController extends BaseController {

    @Autowired
    private PictureQueryService pictureQueryService;

    /**
     * 查询图片
     * @param pageable
     * @return
     */
    @ApiOperation(value = "获取图片列表", notes = "获取图片列表", httpMethod = "GET")
    @GetMapping(value = "/list")
    public Result getPictures(Pageable pageable) {

        return Result.success(pictureQueryService.queryAll(pageable));
    }

    /**
     * 上传图片
     * @param file
     * @return
     */
    @ApiOperation(value = "上传图片", notes = "上传图片", httpMethod = "POST")
    @PostMapping(value = "/upload")
    public Result upload(@RequestParam MultipartFile file) {

        return  Result.success(pictureQueryService.upload(file));
    }


    /**
     * 删除图片
     * @param url
     * @return
     */
    @ApiOperation(value = "删除图片", notes = "删除图片", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestParam(name = "url") String url){
        pictureQueryService.delete(url);
        return Result.success(null);
    }
}

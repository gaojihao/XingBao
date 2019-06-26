package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.model.Picture;
import com.lizhi.xingbao.service.PictureQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/api")
public class PictureController extends BaseController {


    @Autowired
    private PictureQueryService pictureQueryService;

    @GetMapping(value = "/pictures")
    public Result getPictures(Picture resources, Pageable pageable) {
        return Result.success(pictureQueryService.queryAll(resources, pageable));
    }

    /**
     * 上传图片
     * @param file
     * @return
     */
    public Result upload(@RequestParam MultipartFile file) {
        return  Result.success(pictureQueryService.upload(file));
    }
}

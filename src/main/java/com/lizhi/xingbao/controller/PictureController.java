package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.model.Picture;
import com.lizhi.xingbao.service.PictureQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/api")
public class PictureController extends BaseController {

    @Autowired
    private PictureQueryService pictureQueryService;

    /**
     * 查询图片
     * @param resources
     * @param pageable
     * @return
     */
    @GetMapping(value = "/pictures")
    public Result getPictures(Picture resources, Pageable pageable) {
        return Result.success(pictureQueryService.queryAll(resources, pageable));
    }

    /**
     * 上传图片
     * @param file
     * @return
     */
    @PostMapping(value = "/upload/picture")
    public Result upload(@RequestParam MultipartFile file) {
        return  Result.success(pictureQueryService.upload(file));
    }


    /**
     * 删除图片
     * @param id
     * @return
     */
    @GetMapping(value = "/pictures/{id}")
    public Result delete(@PathVariable Integer id){
        pictureQueryService.delete(id);
        return Result.success(null);
    }
}

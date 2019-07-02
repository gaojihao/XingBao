package com.lizhi.xingbao.service;

import com.lizhi.xingbao.model.Picture;
import org.springframework.web.multipart.MultipartFile;

import java.awt.print.Pageable;
import java.util.List;

public interface PictureQueryService {

    /**
     * 上传图片
     * @param file
     * @return
     */
    Picture upload(MultipartFile file);

    /**
     * 分页获取图片数据
     * @param picture
     * @param pageable
     * @return
     */
    List<Picture> queryAll(Picture picture, Pageable pageable);

    /**
     * 删除图片
     * @param id
     */
    void delete(Integer id);
}

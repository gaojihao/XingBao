package com.lizhi.xingbao.service;

import com.lizhi.xingbao.model.Picture;

import java.awt.print.Pageable;
import java.util.List;

public interface PictureQueryService {

    /**
     * 分页获取图片数据
     * @param picture
     * @param pageable
     * @return
     */
    List<Picture> queryAll(Picture picture, Pageable pageable);
}

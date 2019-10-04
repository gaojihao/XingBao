package com.lizhi.xingbao.service;

import com.lizhi.xingbao.entity.Picture;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface PictureQueryService {

    /**
     * 上传图片
     * @param file
     * @return
     */
    Picture upload(MultipartFile file);

    /**
     * 分页获取图片数据
     * @param pageable
     * @return
     */
    Object queryAll(Pageable pageable);

    /**
     * 删除图片
     * @param url
     */
    void delete(String url);
}

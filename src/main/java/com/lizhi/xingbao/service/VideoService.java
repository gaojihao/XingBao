package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.VideoDto;
import com.lizhi.xingbao.entity.Video;
import com.lizhi.xingbao.request.VideoQueryCriteria;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface VideoService {

    /**
     * 上传视频
     * @param file
     * @return
     */
    Map upload(MultipartFile file);
    /**
     * 创建视频
     * @param dto
     */
    void createVideo(VideoDto dto);

    /**
     * 修改视频
     * @param dto
     */
    void editVideo(VideoDto dto);

    /**
     * 视频详情
     * @param Id
     * @return
     */
    VideoDto videoDetail(Integer Id);

    /**
     * 获取课程下的视频列表
     * @param criteria
     * @param pageable
     * @return
     */
    Object getVideoList(VideoQueryCriteria criteria, Pageable pageable);

    /**
     * 删除视频
     * @param Id
     */
    void deleteVideo(Integer Id);
}

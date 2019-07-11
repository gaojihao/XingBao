package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.VideoDto;
import com.lizhi.xingbao.entity.Video;

import java.util.List;

public interface VideoService {

    VideoDto findOne(Integer Id);

    void saveVideo(Video video);

    void editVideo(Video video);

    List<VideoDto> queryByCourse(Integer course);
}

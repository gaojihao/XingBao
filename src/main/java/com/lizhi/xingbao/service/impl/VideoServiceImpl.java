package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.dto.VideoDto;
import com.lizhi.xingbao.entity.Audio;
import com.lizhi.xingbao.entity.Video;
import com.lizhi.xingbao.respository.VideoRespository;
import com.lizhi.xingbao.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("VideoService")
public class VideoServiceImpl implements VideoService {
    private static final Logger logger = LoggerFactory.getLogger(VideoServiceImpl.class);

    @Autowired
    private VideoRespository videoRespository;

    @Override
    public void createVideo(VideoDto dto) {
        if (videoRespository.findByUrl(dto.getUrl()) != null){
            throw new ParamException("url 已存在");
        }

        Video video = new Video();

        video.setCourse(dto.getCourse());
        video.setDuration(dto.getDuration());
        video.setTitle(dto.getTitle());
        video.setUrl(dto.getUrl());

        videoRespository.save(video);
    }


    @Override
    public void editVideo(VideoDto dto) {
        Optional<Video> optional = videoRespository.findById(dto.getVideoId());
        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Video video = optional.get();

        video.setCourse(dto.getCourse());
        video.setDuration(dto.getDuration());
        video.setTitle(dto.getTitle());
        video.setUrl(dto.getUrl());

        videoRespository.save(video);
    }

    @Override
    public VideoDto videoDetail(Integer Id) {
        Optional<Video> optional = videoRespository.findById(Id);
        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Video video = optional.get();
        VideoDto dto = new VideoDto();

        dto.setCourse(video.getCourse());
        dto.setDuration(video.getDuration());
        dto.setTitle(video.getTitle());
        dto.setUrl(video.getUrl());
        dto.setVideoId(video.getId());

        return dto;

    }

    @Override
    public List<VideoDto> getVideoList(Integer course) {

        List<VideoDto> list = new ArrayList<>();
        List<Video> videoList = videoRespository.queryAllByCourse(course);

        for (Video video : videoList){
            VideoDto dto = new VideoDto();
            dto.setCourse(video.getCourse());
            dto.setDuration(video.getDuration());
            dto.setTitle(video.getTitle());
            dto.setUrl(video.getUrl());
            dto.setVideoId(video.getId());
            list.add(dto);
        }
        return list;
    }

    @Override
    public void deleteVideo(Integer Id) {
        videoRespository.deleteById(Id);
    }

}

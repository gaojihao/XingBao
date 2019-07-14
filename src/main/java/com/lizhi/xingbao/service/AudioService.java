package com.lizhi.xingbao.service;

import com.lizhi.xingbao.dto.AudioDto;

import java.util.List;

public interface AudioService {

    /**
     * 创建音频
     * @param dto
     */
    void createAudio(AudioDto dto);

    /**
     * 修改音频
     * @param dto
     */
    void editAudio(AudioDto dto);

    /**
     * 获取音频详情
     * @param Id 音频id
     * @return
     */
    AudioDto audioDetial(Integer Id);

    /**
     * 删除音频
     * @param Id 音频id
     */
    void deleteAudio(Integer Id);

    /**
     * 获取课程下的音频列表
     * @param courseId 课程id
     * @return
     */
    List<AudioDto> getAudioList(Integer courseId);
}

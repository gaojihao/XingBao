package com.lizhi.xingbao.service;

import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.request.AudioQueryCriteria;
import org.springframework.data.domain.Pageable;

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
     * @param audioId 音频id
     * @return
     */
    AudioDto audioDetail(Integer audioId);

    /**
     * 删除音频
     * @param audioId 音频id
     */
    void deleteAudio(Integer audioId);

    /**
     * 获取课程下的音频列表
     * @param criteria 条件查询
     * @param pageable 分页信息
     * @return
     */
    Object getAudioList(AudioQueryCriteria criteria, Pageable pageable);
}

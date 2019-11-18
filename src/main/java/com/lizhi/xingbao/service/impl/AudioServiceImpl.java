package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.entity.Audio;
import com.lizhi.xingbao.request.AudioQueryCriteria;
import com.lizhi.xingbao.respository.AudioRespository;
import com.lizhi.xingbao.service.AudioService;
import com.lizhi.xingbao.utils.PageUtil;
import com.lizhi.xingbao.utils.QueryHelp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("AudioService")
public class AudioServiceImpl implements AudioService {
    private static final Logger logger = LoggerFactory.getLogger(AudioServiceImpl.class);

    @Autowired
    private AudioRespository respository;

    @Override
    public void createAudio(AudioDto dto){
        if (respository.findByUrl(dto.getUrl()) != null){
            throw new ParamException("url 已存在");
        }

        Audio audio = new Audio();
        audio.setCourse(dto.getCourse());
        audio.setDuration(dto.getDuration());
        audio.setTitle(dto.getTitle());
        audio.setUrl(dto.getUrl());

        respository.save(audio);
    }

    @Override
    public void editAudio(AudioDto dto){
        Optional<Audio> optional = respository.findById(dto.getAudioId());

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Audio audio = optional.get();

        audio.setCourse(dto.getCourse());
        audio.setDuration(dto.getDuration());
        audio.setTitle(dto.getTitle());
        audio.setUrl(dto.getUrl());

        respository.save(audio);

    }


    @Override
    public AudioDto audioDetail(Integer audioId){
        Optional<Audio> optional = respository.findById(audioId);

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Audio audio = optional.get();

        return toDto(audio);
    }


    @Override
    public void deleteAudio(Integer audioId) {
        respository.deleteById(audioId);
    }

    private AudioDto toDto(Audio audio) {
        AudioDto audioDto = new AudioDto();
        audioDto.setCourse(audio.getCourse());
        audioDto.setDuration(audio.getDuration());
        audioDto.setTitle(audio.getTitle());
        audioDto.setUrl(audio.getUrl());
        audioDto.setAudioId(audio.getId());
        return audioDto;
    }


    @Override
    public Object getAudioList(AudioQueryCriteria criteria, Pageable pageable){
        Page<Audio> page = respository.findAll(((root, criteriaQuery, cb) -> QueryHelp.getPredicate(root, criteria, cb)),pageable);
        return PageUtil.toPage(page.map(this::toDto));
    }
}

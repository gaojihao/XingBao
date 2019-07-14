package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.entity.Audio;
import com.lizhi.xingbao.respository.AudioRespository;
import com.lizhi.xingbao.service.AudioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("AudioService")
public class AudioServiceImpl implements AudioService {
    private static final Logger logger = LoggerFactory.getLogger(AudioServiceImpl.class);

    @Autowired
    private AudioRespository respository;

    @Override
    public void createAudio(AudioDto dto){
        if (respository.findByUrl(dto.getUrl()) != null){
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
        Optional<Audio> optional = respository.findById(dto.getAduioId());

        if (!optional.isPresent()){
        }

        Audio audio = optional.get();

        audio.setCourse(dto.getCourse());
        audio.setDuration(dto.getDuration());
        audio.setTitle(dto.getTitle());
        audio.setUrl(dto.getUrl());

        respository.save(audio);

    }


    @Override
    public AudioDto audioDetail(Integer Id){
        Optional<Audio> optional = respository.findById(Id);

        if (!optional.isPresent()){
            return null;
        }

        Audio audio = optional.get();

        AudioDto audioDto = new AudioDto();
        audioDto.setCourse(audio.getCourse());
        audioDto.setDuration(audio.getDuration());
        audioDto.setTitle(audio.getTitle());
        audioDto.setUrl(audio.getUrl());
        audioDto.setAduioId(audio.getId());

        return audioDto;

    }


    @Override
    public void deleteAudio(Integer Id) {

    }


    @Override
    public List<AudioDto> getAudioList(Integer courseId){
        return null;
    }
}

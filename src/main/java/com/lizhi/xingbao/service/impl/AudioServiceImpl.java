package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.respository.AudioRespository;
import com.lizhi.xingbao.service.AudioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AudioService")
public class AudioServiceImpl implements AudioService {
    private static final Logger logger = LoggerFactory.getLogger(AudioServiceImpl.class);

    @Autowired
    private AudioRespository respository;

    @Override
    public void createAudio(AudioDto dto){

    }

    @Override
    public void editAudio(AudioDto dto){

    }


    @Override
    public AudioDto audioDetail(Integer Id){
        return null;
    }


    @Override
    public void deleteAudio(Integer Id) {

    }


    @Override
    public List<AudioDto> getAudioList(Integer courseId){
        return null;
    }
}

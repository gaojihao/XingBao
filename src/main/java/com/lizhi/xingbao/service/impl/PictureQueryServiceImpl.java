package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.entity.Picture;
import com.lizhi.xingbao.respository.PictureRepository;
import com.lizhi.xingbao.service.PictureQueryService;
import com.lizhi.xingbao.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service("PictureQueryService")
public class PictureQueryServiceImpl implements PictureQueryService {

    @Autowired
    private PictureRepository pictureRepository;

    @Override
    public Picture upload(MultipartFile file){

        Picture picture = new Picture();

        return picture;
    }

    @Override
    public void delete(String url){
        Picture picture = pictureRepository.findByUrl(url);
        if (picture == null) {
            throw  new ParamException("未找到改url");
        }

        pictureRepository.delete(picture);
    }

    @Override
    public Object queryAll(Pageable pageable) {

        return PageUtil.toPage(pictureRepository.findAll(pageable));
    }
}

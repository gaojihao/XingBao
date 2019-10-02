package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.entity.Picture;
import com.lizhi.xingbao.respository.PictureRepository;
import com.lizhi.xingbao.service.PictureQueryService;
import com.lizhi.xingbao.utils.PageUtil;
import com.lizhi.xingbao.utils.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.Optional;

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
    public void delete(Integer id){
        Optional<Picture> picture = pictureRepository.findById(id);

        ValidationUtil.isNull(picture,"Picture", "id", id);
        Picture pic =  picture.get();

        pictureRepository.delete(pic);
    }

    @Override
    public Object queryAll(Pageable pageable) {

        return PageUtil.toPage(pictureRepository.findAll(pageable));
    }
}

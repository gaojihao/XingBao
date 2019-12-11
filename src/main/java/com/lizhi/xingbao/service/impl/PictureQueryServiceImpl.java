package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.common.Exception.ServerException;
import com.lizhi.xingbao.dto.PictureDto;
import com.lizhi.xingbao.entity.Picture;
import com.lizhi.xingbao.respository.PictureRepository;
import com.lizhi.xingbao.service.PictureQueryService;
import com.lizhi.xingbao.utils.FileUtils;
import com.lizhi.xingbao.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

@Service("PictureQueryService")
public class PictureQueryServiceImpl implements PictureQueryService {

    @Autowired
    private PictureRepository pictureRepository;

    @Override
    public PictureDto upload(MultipartFile file){

        //检查文件是否为空
        if (file.isEmpty()){
            throw new ParamException("请上传图片");
        }

        //大小检查
        if (file.getSize() > 1024*1000){
            throw new ParamException("请上传1M以内的图片");
        }

        BufferedImage bi = null;

        //检查是否是图片
        try {
            bi = ImageIO.read(file.getInputStream());

        }catch (Exception e){

        }

        if (bi == null){
            throw new ParamException("请上传图片类型");
        }


        // 要上传的目标文件存放路径
        String localPath = "/image";
        // 上传成功或者失败的提示
        String msg = "";


        Picture picture = FileUtils.upload(file,localPath,file.getOriginalFilename());
        if (picture == null){
            throw new ServerException("保存文件失败");
        }

        pictureRepository.save(picture);

        PictureDto dto = new PictureDto();
        dto.setHeight(picture.getHeight());
        dto.setUrl(picture.getUrl());
        dto.setWidth(picture.getWidth());

        return dto;
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

        return pictureRepository.findAll(pageable).getContent();
    }
}

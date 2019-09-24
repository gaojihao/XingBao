package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.TagDto;
import com.lizhi.xingbao.entity.Tag;
import com.lizhi.xingbao.respository.TagRespository;
import com.lizhi.xingbao.service.TagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("TagService")
public class TagServiceImpl implements TagService {
    private static final Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);

    @Autowired
    private TagRespository tagRespository;

    @Override
    public void createTag(TagDto dto) {
        if (tagRespository.findByName(dto.getName()) != null){
            throw new ParamException("目标已存在");
        }

        Tag tag = new Tag();
        tag.setName(dto.getName());
        tag.setDesc(dto.getDesc());

        tagRespository.save(tag);
    }


    @Override
    public void editTag(TagDto dto) {
        Optional<Tag> optional = tagRespository.findById(dto.getTagId());

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Tag tag = optional.get();
        tag.setName(dto.getName());
        tag.setDesc(dto.getDesc());

        tagRespository.save(tag);
    }



    @Override
    public TagDto tagDetail(Integer Id) {
        Optional<Tag> optional = tagRespository.findById(Id);

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        Tag tag = optional.get();

        TagDto dto = new TagDto();
        dto.setDesc(tag.getDesc());
        dto.setName(tag.getName());
        dto.setTagId(tag.getId());

        return dto;

    }

    @Override
    public void deleteTag(Integer Id) {
        tagRespository.deleteById(Id);
    }

    @Override
    public List<TagDto> getAllTags() {
        List<TagDto> list = new ArrayList<>();
        List<Tag> tagList = tagRespository.findAll();

        for (Tag tag : tagList){
            TagDto dto = new TagDto();
            dto.setDesc(tag.getDesc());
            dto.setName(tag.getName());
            dto.setTagId(tag.getId());
            list.add(dto);
        }
        return list;
    }
}

package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.CourseCategotyDto;
import com.lizhi.xingbao.entity.CourseCategoty;
import com.lizhi.xingbao.respository.CourseCategoryRespository;
import com.lizhi.xingbao.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CourseCategoryRespository courseCategoryRespository;

    @Override
    public void createCategory(CourseCategotyDto dto) {

        if (courseCategoryRespository.findByName(dto.getName()) == null){
            throw new ParamException("目标已存在");
        }

        CourseCategoty categoty = new CourseCategoty();
        categoty.setName(dto.getName());
        categoty.setDesc(dto.getDesc());
        categoty.setSubTitle(dto.getSubTitle());

        courseCategoryRespository.save(categoty);

    }

    @Override
    public void editCategory(CourseCategotyDto dto) {
        Optional<CourseCategoty> optional = courseCategoryRespository.findById(dto.getCategoryId());

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        CourseCategoty categoty = optional.get();
        categoty.setSubTitle(dto.getSubTitle());
        categoty.setName(dto.getName());
        categoty.setDesc(dto.getDesc());

        courseCategoryRespository.save(categoty);
    }


    @Override
    public CourseCategotyDto categoryDetail(Integer Id) {
        Optional<CourseCategoty> optional = courseCategoryRespository.findById(Id);

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        CourseCategoty categoty = optional.get();

        CourseCategotyDto dto = new CourseCategotyDto();
        dto.setSubTitle(categoty.getSubTitle());
        dto.setName(categoty.getName());
        dto.setDesc(categoty.getDesc());
        dto.setCategoryId(categoty.getId());

        return dto;

    }


    @Override
    public void deleteCategoty(Integer Id) {
        courseCategoryRespository.deleteById(Id);
    }

    @Override
    public List<CourseCategotyDto> getAllCategoty() {
        List<CourseCategotyDto> list = new ArrayList<>();

        List<CourseCategoty> categotyList = courseCategoryRespository.findAll();

        for (CourseCategoty categoty : categotyList) {
            CourseCategotyDto dto = new CourseCategotyDto();
            dto.setSubTitle(categoty.getSubTitle());
            dto.setName(categoty.getName());
            dto.setDesc(categoty.getDesc());
            dto.setCategoryId(categoty.getId());
            list.add(dto);
        }

        return list;
    }
}

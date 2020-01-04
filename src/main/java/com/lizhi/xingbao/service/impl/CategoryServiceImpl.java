package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.CategoryModel;
import com.lizhi.xingbao.dto.CourseCategotyDto;
import com.lizhi.xingbao.entity.CourseCategory;
import com.lizhi.xingbao.respository.CourseCategoryRespository;
import com.lizhi.xingbao.respository.CourseRespository;
import com.lizhi.xingbao.service.CategoryService;
import com.lizhi.xingbao.service.CourseService;
import com.lizhi.xingbao.utils.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CourseCategoryRespository courseCategoryRespository;

    @Autowired
    private CourseService courseService;

    @Override
    public void createCategory(CourseCategotyDto dto) {
        if (courseCategoryRespository.findByName(dto.getName()) != null){
            throw new ParamException("目标已存在");
        }

        CourseCategory category = new CourseCategory();
        category.setName(dto.getName());
        courseCategoryRespository.save(category);

    }

    @Override
    public void editCategory(CourseCategotyDto dto) {
        Optional<CourseCategory> optional = courseCategoryRespository.findById(dto.getCategoryId());

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        CourseCategory category = optional.get();
        category.setName(dto.getName());
        category.setId(dto.getCategoryId());

        courseCategoryRespository.save(category);
    }


    @Override
    public CourseCategotyDto categoryDetail(Integer Id) {
        Optional<CourseCategory> optional = courseCategoryRespository.findById(Id);

        if (!optional.isPresent()){
            throw new ParamException("目标不存在");
        }

        CourseCategory category = optional.get();

        CourseCategotyDto dto = new CourseCategotyDto();
        dto.setName(category.getName());
        dto.setCategoryId(category.getId());
        return dto;

    }


    @Override
    public void deleteCategoty(Integer Id) {

        courseCategoryRespository.deleteById(Id);
    }

    @Override
    public Map getAllCategoty() {
        List<CourseCategotyDto> list = new ArrayList<>();

        List<CourseCategory> categoryList = courseCategoryRespository.findAll();

        for (CourseCategory category : categoryList) {
            CourseCategotyDto dto = new CourseCategotyDto();
            dto.setName(category.getName());
            dto.setCategoryId(category.getId());
            list.add(dto);
        }

        return PageUtil.toPage(list,list.size());
    }

    @Override
    public List<CategoryModel> getCategotyList() {
        List<CategoryModel> list = new ArrayList<>();

        List<CourseCategory> categoryList = courseCategoryRespository.findAll();

        for (CourseCategory category : categoryList) {
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setTitle(category.getName());
            categoryModel.setCategoryId(category.getId());
            categoryModel.setList(courseService.getAllCourseOfCategory(category.getId()));
            list.add(categoryModel);
        }

        return list;

    }
}

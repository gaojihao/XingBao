package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.CourseCategotyDto;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    /**
     * 创建大类
     * @param dto
     */
    void createCategory(CourseCategotyDto dto);


    /**
     * 修改大类
     * @param dto
     */
    void editCategory(CourseCategotyDto dto);


    /**
     * 获取大类详情
     * @param Id  大类 id
     * @return
     */
    CourseCategotyDto categoryDetail(Integer Id);

    /**
     * 删除大类
     * @param Id 大类 id
     */
    void deleteCategoty(Integer Id);

    /**
     * 获取所有大类
     * @return
     */
    Map getAllCategoty();
}

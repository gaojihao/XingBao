package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.TagDto;

import java.util.List;
import java.util.Map;

public interface TagService {

    /**
     * 创建tag
     * @param dto
     */
    void createTag(TagDto dto);


    /**
     * 修改tag
     * @param dto
     */
    void editTag(TagDto dto);


    /**
     * 获取tag详情
     * @param Id  tag id
     * @return
     */
    TagDto tagDetail(Integer Id);

    /**
     * 删除tag
     * @param Id tag id
     */
    void deleteTag(Integer Id);

    /**
     * 获取所有tag
     * @return
     */
    Map getAllTags();

}

package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.TagDto;
import com.lizhi.xingbao.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/tag")
public class TagController extends BaseController{

    @Autowired
    private TagService tagService;

    @RequestMapping("add")
    public void add(@RequestBody TagDto dto){
        tagService.createTag(dto);
        Result.success(null);
    }

    @RequestMapping("delete")
    public void delete(@RequestBody Integer Id){
        tagService.deleteTag(Id);
        Result.success(null);
    }

    @RequestMapping("edit")
    public Result edit(@RequestBody TagDto dto){
        tagService.editTag(dto);
        return Result.success(null);
    }

    @RequestMapping("detail")
    public Result detail(@RequestBody Integer Id){

        return Result.success(tagService.tagDetail(Id));
    }

    @RequestMapping("list")
    public Result list(){
        return Result.success(tagService.getAllTags());
    }
}

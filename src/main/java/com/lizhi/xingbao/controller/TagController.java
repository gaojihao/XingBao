package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.TagDto;
import com.lizhi.xingbao.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "标签")
@RestController
@RequestMapping("xingbao/api/v1/tag")
public class TagController extends BaseController{

    @Autowired
    private TagService tagService;

    @ApiOperation(value = "添加标签", notes = "标签分类", httpMethod = "POST")
    @PostMapping("add")
    public Result add(@ModelAttribute TagDto dto){
        tagService.createTag(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "删除标签", notes = "删除标签", httpMethod = "GET")
    @GetMapping("delete")
    public Result delete(@RequestParam(name = "tagId") Integer Id){
        tagService.deleteTag(Id);
        return Result.success(null);
    }

    @ApiOperation(value = "编辑标签", notes = "编辑标签", httpMethod = "POST")
    @PostMapping("edit")
    public Result edit(@ModelAttribute TagDto dto){
        tagService.editTag(dto);
        return Result.success(null);
    }

    @ApiOperation(value = "获取标签详情", notes = "获取标签详情", httpMethod = "GET")
    @GetMapping("detail")
    public Result detail(@RequestParam(name = "tagId") Integer Id){

        return Result.success(tagService.tagDetail(Id));
    }

    @ApiOperation(value = "获取标签列表", notes = "获取标签列表", httpMethod = "GET")
    @GetMapping("list")
    public Result list(){

        return Result.success(tagService.getAllTags());
    }
}

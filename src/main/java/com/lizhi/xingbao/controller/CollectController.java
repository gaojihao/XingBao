package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.request.CollectRequest;
import com.lizhi.xingbao.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/collect")
public class CollectController extends BaseController{

    @Autowired
    private CollectService collectService;

    @PostMapping("/add")
    public Result add(@RequestBody CollectRequest request) {
        if (request.getCourseId() == null || request.getUserId() == null ||
        request.getIsAdd() == null){
            return Result.fail("参数错误");
        }

        collectService.updateCollect(request);

        return Result.success(null);
    }

    @PostMapping("/list")
    public Result list(@RequestBody String userId, @RequestBody Pageable pageable) {
        return Result.success(collectService.getCollectByUserId(userId, pageable));
    }

}

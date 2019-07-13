package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/collect")
public class CollectController extends BaseController{

    @Autowired
    private CollectService collectService;


}

package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public Result register(String phone, String password){

        boolean exist = userService.userExist(phone);
        if (exist){
            return Result.fail("用户已存在");
        }
        return Result.success("123");
    }

    @RequestMapping("/login")
    public Result login(String phone, String password){

        System.out.println(phone);
        System.out.println(password);

        return Result.success(null);
    }


}

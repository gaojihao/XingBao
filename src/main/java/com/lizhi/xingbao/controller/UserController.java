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
    private UserService userService;

    @RequestMapping("/register")
    public Result register(String phone, String password){

        boolean exist = userService.isUserExist(phone);
        if (exist){
            return Result.fail("用户已存在");
        }
        return Result.success(userService.createAccount(phone, password));
    }

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public Result login(String phone, String password){

        if (userService.userLogin(phone, password) == null){
            return Result.fail("用户名或密码错误");
        }

        return Result.success(userService.userLogin(phone, password));
    }


}

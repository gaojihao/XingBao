package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.AccountDto;
import com.lizhi.xingbao.entity.Account;
import com.lizhi.xingbao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("xingbao/api/v1/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param resources
     * @return
     */
    @RequestMapping("/register")
    public Result register(@Validated @RequestBody Account resources){

        boolean exist = userService.isUserExist(resources.getPhone());
        if (exist){
            return Result.fail("用户已存在");
        }
        return Result.success(userService.createAccount(resources));
    }

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public Result login(String phone, String password){

        AccountDto dto = userService.userLogin(phone, password);

        return Result.success(dto);
    }


}

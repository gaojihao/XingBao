package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.AccountDto;
import com.lizhi.xingbao.entity.Account;
import com.lizhi.xingbao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("register")
    public Result register(@RequestBody Account resources){

        boolean exist = userService.isUserExist(resources.getPhone());
        if (exist){
            return Result.fail("用户已存在");
        }

        userService.createAccount(resources);

        return Result.success(null);
    }

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody String phone, @RequestBody String password){

        AccountDto dto = userService.userLogin(phone, password);

        return Result.success(dto);
    }


    @PostMapping("/update/headerImage")
    public Result updateImg(@RequestBody String userId,@RequestBody String url){
        userService.updateHeadImg(userId, url);
        return Result.success(null);
    }

    @PostMapping("/update/pwd")
    public Result updatePwd(@RequestBody String userId,@RequestBody String currentPwd,@RequestBody String password){
        userService.modifyPwd(userId, currentPwd, password);
        return Result.success(null);
    }

    @PostMapping("/update/nickName")
    public Result updateNickName(@RequestBody String userId,@RequestBody String nickName){
        userService.modifyNickName(userId, nickName);
        return Result.success(null);
    }

    @PostMapping("/update/phone")
    public Result updateMobile(@RequestBody String userId,@RequestBody String phone){
        userService.modifyPhone(userId, phone);
        return Result.success(null);
    }

    /**
     * 用户列表
     * @return
     */
    @GetMapping("/list")
    public Result list(){
        return Result.success(userService.findAll());
    }


}

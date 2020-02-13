package com.lizhi.xingbao.controller;

import com.lizhi.xingbao.common.Result;
import com.lizhi.xingbao.dto.AccountDto;
import com.lizhi.xingbao.entity.Account;
import com.lizhi.xingbao.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "账户")
@RestController
@RequestMapping("api/v1/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param phone
     * @param password
     * @return
     */
    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @PostMapping("register")
    public Result register(@RequestParam String phone,@RequestParam String password){

        boolean exist = userService.isUserExist(phone);
        if (exist){
            return Result.fail("用户已存在");
        }

        userService.createAccount(phone, password);

        return Result.success(null);
    }

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @PostMapping("/login")
    public Result login(@RequestParam String phone, @RequestParam String password){

        AccountDto dto = userService.userLogin(phone, password);

        return Result.success(dto);
    }

    @ApiOperation(value = "修改头像", notes = "修改头像", httpMethod = "POST")
    @PostMapping("/update/headerImage")
    public Result updateImg(@RequestParam String userId,@RequestParam String url){
        userService.updateHeadImg(userId, url);
        return Result.success(null);
    }

    @ApiOperation(value = "修改密码", notes = "修改密码", httpMethod = "POST")
    @PostMapping("/update/pwd")
    public Result updatePwd(@RequestParam String userId,@RequestParam String currentPwd,@RequestParam String password){
        userService.modifyPwd(userId, currentPwd, password);
        return Result.success(null);
    }

    @ApiOperation(value = "修改昵称", notes = "修改昵称", httpMethod = "POST")
    @PostMapping("/update/nickName")
    public Result updateNickName(@RequestParam String userId,@RequestParam String nickName){
        userService.modifyNickName(userId, nickName);
        return Result.success(null);
    }

    @ApiOperation(value = "修改手机号", notes = "修改手机号", httpMethod = "POST")
    @PostMapping("/update/phone")
    public Result updateMobile(@RequestParam String userId,@RequestParam String phone){
        userService.modifyPhone(userId, phone);
        return Result.success(null);
    }

    /**
     * 用户列表
     * @return
     */
    @ApiOperation(value = "用户列表", notes = "用户列表", httpMethod = "GET")
    @GetMapping("/list")
    public Result list(){
        return Result.success(userService.findAll());
    }


}

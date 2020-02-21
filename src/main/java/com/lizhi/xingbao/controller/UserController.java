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

import javax.servlet.http.HttpServletRequest;

@Api(tags = "账户")
@RestController
@RequestMapping("member")
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
            return Result.fail("用户已存在,请去登录");
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

        return Result.success(dto.getUserId());
    }

    @ApiOperation(value = "修改密码", notes = "修改密码", httpMethod = "POST")
    @PostMapping("/update/pwd")
    public Result updatePwd(HttpServletRequest request,@RequestParam String password,@RequestParam String newPassword){
        String token = request.getHeader("token");
        if (token == null){
            return Result.fail("请先登录");
        }
        userService.modifyPwd(token, password, newPassword);
        return Result.success(null);
    }

    @ApiOperation(value = "忘记密码", notes = "忘记密码", httpMethod = "POST")
    @PostMapping("/pwd/reset")
    public Result resetPwd(@RequestParam String smsCode,@RequestParam String phone,@RequestParam String password){
        return Result.success(null);
    }

    @ApiOperation(value = "获取个人信息", notes = "获取个人信息", httpMethod = "GET")
    @GetMapping("/info")
    public Result getMemberInfo(HttpServletRequest request){
        String token = request.getHeader("token");
        if (token == null){
            return Result.fail("请先登录");
        }
        return Result.success(userService.getMemberInfo(token));
    }

    @ApiOperation(value = "更新个人信息", notes = "更新个人信息", httpMethod = "POST")
    @PostMapping("/update/info")
    public Result updateMemberInfo(@RequestBody AccountDto info){

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

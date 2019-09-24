package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.AccountDto;
import com.lizhi.xingbao.entity.Account;

import java.util.List;

public interface UserService {

    /**
     * 检测用户是否存在
     * @param phone
     * @return
     */
    Boolean isUserExist(String phone);

    /**
     * 创建用户
     * @param resources
     * @return
     */
    void createAccount(String phone, String password);

    /**
     * 更新用户头像
     * @param userId
     * @param url
     * @return
     */
    void updateHeadImg(String userId, String url);

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    AccountDto userLogin(String phone, String password);

    /**
     * 修改用户密码
     * @param userId
     * @param currentPwd 当前密码
     * @param password 新密码
     * @return
     */
    void modifyPwd(String userId, String currentPwd, String password);

    /**
     * 修改昵称
     * @param userId
     * @param nickName 用户昵称
     * @return
     */
    void modifyNickName(String userId, String nickName);


    /**
     * 修改手机号
     * @param userId
     * @param phone 手机号码
     * @return
     */
    void modifyPhone(String userId, String phone);


    List<AccountDto> findAll();
}

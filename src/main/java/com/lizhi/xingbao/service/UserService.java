package com.lizhi.xingbao.service;


import com.lizhi.xingbao.entity.Account;

public interface UserService {

    /**
     * 检测用户是否存在
     * @param phone
     * @return
     */
    Boolean isUserExist(String phone);

    /**
     * 创建用户
     * @param phone
     * @param password
     * @return
     */
    Account createAccount(String phone, String password);

    /**
     * 更新用户头像
     * @param id
     * @param url
     * @return
     */
    Account updateHeadImg(Integer id, String url);

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    Account userLogin(String phone, String password);

    /**
     * 修改用户密码
     * @param id userId
     * @param currentPwd 当前密码
     * @param password 新密码
     * @return
     */
    Account modifyPwd(Integer id, String currentPwd, String password);

    /**
     * 修改昵称
     * @param id userId
     * @param nickName 用户昵称
     * @return
     */
    Account modifyNickName(Integer id, String nickName);


    /**
     * 修改手机号
     * @param id userId
     * @param phone 手机号码
     * @return
     */
    Account modifyPhone(Integer id, String phone);
}

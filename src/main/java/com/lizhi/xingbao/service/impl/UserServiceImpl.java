package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dao.UserDao;
import com.lizhi.xingbao.entity.Account;
import com.lizhi.xingbao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Boolean isUserExist(String phone){

        return userDao.queryAccount(phone);
    }

    @Override
    public Account createAccount(String phone, String password) {

        return userDao.createAccount(phone, password);
    }


    @Override
    public Account updateHeadImg(Integer id, String url) {
        return userDao.updateHeaderImage(id,url);
    }

    @Override
    public Account userLogin(String phone, String password) {
        return userDao.userLogin(phone, password);
    }

    @Override
    public Account modifyPwd(Integer id, String currentPwd, String password) {
        return userDao.modifyPwd(id, currentPwd, password);
    }

    @Override
    public Account modifyNickName(Integer id, String nickName) {
        return userDao.modifyNickName(id, nickName);
    }

    @Override
    public Account modifyPhone(Integer id, String phone) {
        return userDao.modifyPhone(id, phone);
    }
}

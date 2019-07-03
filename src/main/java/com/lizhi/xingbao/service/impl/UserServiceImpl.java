package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.dto.AccountDto;
import com.lizhi.xingbao.entity.Account;
import com.lizhi.xingbao.respository.UserRespository;
import com.lizhi.xingbao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRespository userRespository;

    @Override
    public Boolean isUserExist(String phone){

        Account account = userRespository.findAccountsByPhoneEquals(phone);

        return account == null? false:true;
    }

    @Override
    public AccountDto createAccount(String phone, String password) {

        return null;
    }

    @Override
    public AccountDto updateHeadImg(String userId, String url) {
        return null;
    }

    @Override
    public AccountDto userLogin(String phone, String password) {
        return null;
    }

    @Override
    public AccountDto modifyPwd(String userId, String currentPwd, String password) {
        return null;
    }

    @Override
    public AccountDto modifyNickName(String userId, String nickName) {
        return null;
    }

    @Override
    public AccountDto modifyPhone(String userId, String phone) {
        return null;
    }
}

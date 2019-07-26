package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
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

        Account account = userRespository.findAccountByPhoneEquals(phone);

        return account == null? false:true;
    }

    @Override
    public AccountDto createAccount(Account resources) {

        if (userRespository.findAccountByPhoneEquals(resources.getPhone()) != null){
            return  null;
        }

        userRespository.save(resources);

        return null;
    }

    private AccountDto toDto(Account account){
        AccountDto dto = new AccountDto();
        dto.setImgUrl(account.getImgUrl());
        dto.setLevel(account.getLevel());
        dto.setNickName(account.getNickName());
        dto.setPhone(account.getPhone());
        dto.setSex(account.getSex());
        dto.setUserId(account.getUserId());
        dto.setVip(account.getVip());
        return dto;
    }

    @Override
    public void updateHeadImg(String userId, String url) {
        Account account = userRespository.findAccountByUserIdEquals(userId);
        if (account == null){
            throw new ParamException("未找到该用户");
        }

        account.setImgUrl(url);
        userRespository.save(account);
    }

    @Override
    public AccountDto userLogin(String phone, String password) {
        Account account = userRespository.findAccountByPhoneEquals(phone);

        if (account == null || !account.getPassword().equals(password)){
            throw new ParamException("用户名或密码错误");
        }

        return toDto(account);
    }

    @Override
    public void modifyPwd(String userId, String currentPwd, String password) {
        Account account = userRespository.findAccountByUserIdEquals(userId);
        if (account == null){
            throw new ParamException("未找到该用户");
        }

        if (!account.getPassword().equals(currentPwd)){
            throw new ParamException("密码错误");
        }

        account.setPassword(password);
        userRespository.save(account);
    }

    @Override
    public void modifyNickName(String userId, String nickName) {

        Account account = userRespository.findAccountByUserIdEquals(userId);
        if (account == null){
            throw new ParamException("未找到该用户");
        }

        account.setNickName(nickName);
        userRespository.save(account);
    }

    @Override
    public void modifyPhone(String userId, String phone) {
        Account account = userRespository.findAccountByUserIdEquals(userId);
        if (account == null){
            throw new ParamException("未找到该用户");
        }

        account.setPhone(phone);
        userRespository.save(account);
    }

    private Account findUserByUserId(String userId) {

        return userRespository.findAccountByUserIdEquals(userId);
    }
}

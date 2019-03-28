package com.lizhi.xingbao.service;

import com.lizhi.xingbao.model.Account;
import com.lizhi.xingbao.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRespository respository;

    public boolean userExist(String phone){

        System.out.println(phone);

        Account user = new Account();
        user.setPhone(phone);

        Example<Account> ex = Example.of(user);
        List<Account> list = respository.findAll(ex);

        System.out.println(list.size());

        if (list.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public Account createAccount(String phone,String password){

        Account user = new Account();
        user.setPhone(phone);
        user.setPassword(password);
        user.setLevel(0);
        user.setVip(false);
        user.setImgUrl("");
        user.setJwt("");
        user.setNickName("");
        user.setSex("");

        respository.save(user);

        return user;
    }
}

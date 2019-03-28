package com.lizhi.xingbao.service;

import com.lizhi.xingbao.model.Account;
import com.lizhi.xingbao.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRespository respository;

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
}

package com.lizhi.xingbao.dao;

import com.lizhi.xingbao.model.Account;
import com.lizhi.xingbao.respository.UserRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private UserRespository userRespository;

    public Boolean queryAccount(String phone) {
        if (phone.isEmpty()){
            return true;
        }
        return userRespository.existsAccountByPhone(phone);
    }

    public Account createAccount(String phone,String password){

        Account account = new Account();
        account.setPhone(phone);
        account.setPassword(password);

        return userRespository.save(account);
    }

    public List<Account> queryAll() {
        return userRespository.findAll();
    }

    public Account queryById(Integer id) {

        return userRespository.findById(id)
                .map(g -> g)
                .orElse(null);
    }

    public Account updateHeaderImage(Integer id, String url){

        Account account = queryById(id);

        if (account == null) {
            return null;
        }
        account.setImgUrl(url);

        return userRespository.save(account);
    }


}

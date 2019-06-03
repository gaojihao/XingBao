package com.lizhi.xingbao.dao;

import com.lizhi.xingbao.model.Account;
import com.lizhi.xingbao.respository.UserRespository;
import org.apache.tomcat.util.buf.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private UserRespository userRespository;

    public Boolean queryAccount(String phone) {
        if (phone.isEmpty()){
            logger.error("------>>>>>> phone fail, param is blank");
            return true;
        }

        logger.info(userRespository.existsAccountByPhone(phone).toString());

        return userRespository.existsAccountByPhone(phone);
    }

    public Account createAccount(String phone,String passwod){

        Account account = new Account();
        account.setPhone(phone);
        account.setPassword(passwod);

        return userRespository.save(account);
    }
}

package com.lizhi.xingbao.service;


import com.lizhi.xingbao.model.Account;

public interface UserService {
    Boolean isUserExist(String phone);

    Account createAccount(String phone, String password);
}

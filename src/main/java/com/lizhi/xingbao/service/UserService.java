package com.lizhi.xingbao.service;

import com.lizhi.xingbao.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRespository respository;
}

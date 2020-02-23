package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.respository.MessageRespository;
import com.lizhi.xingbao.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MessageService")

public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRespository messageRespository;
}

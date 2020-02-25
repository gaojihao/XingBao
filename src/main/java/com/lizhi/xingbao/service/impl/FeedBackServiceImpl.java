package com.lizhi.xingbao.service.impl;


import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.FeedBackDto;
import com.lizhi.xingbao.entity.Account;
import com.lizhi.xingbao.entity.FeedBack;
import com.lizhi.xingbao.respository.FeedBackRespository;
import com.lizhi.xingbao.respository.UserRespository;
import com.lizhi.xingbao.service.FeedBackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aaron
 */
@Service("FeedBackService")
public class FeedBackServiceImpl implements FeedBackService {

    private static final Logger logger = LoggerFactory.getLogger(FeedBackServiceImpl.class);

    @Autowired
    private FeedBackRespository feedBackRespository;

    @Autowired
    private UserRespository userRespository;

    @Override
    public void add(String token,int type,String content){

        if (userRespository.findAccountByUserIdEquals(token) == null){
            throw new ParamException("请登录");
        }
        FeedBack feedBack = new FeedBack();

        feedBack.setContent(content);
        feedBack.setCreateUser(token);
        feedBack.setType(type);

        feedBackRespository.save(feedBack);
    }

    @Override
    public void deleteFeedBack(Integer Id){
        feedBackRespository.deleteById(Id);
    }

    @Override
    public List<FeedBackDto> getAllFeedBack(){
        List<FeedBackDto> list = new ArrayList<>();
        List<FeedBack> feedBackList = feedBackRespository.findAll();

        for (FeedBack feedBack : feedBackList){
            FeedBackDto dto = toDto(feedBack);
            list.add(dto);
        }
        return list;

    }

    private FeedBackDto toDto(FeedBack feedBack){
        FeedBackDto dto = new FeedBackDto();
        dto.setContent(feedBack.getContent());
        dto.setType(feedBack.getType());
        dto.setCreateUser(feedBack.getCreateUser());
        dto.setId(feedBack.getId());
        dto.setCreateTime(feedBack.getCreateTime().toString());

        Account account = userRespository.findAccountByUserIdEquals(feedBack.getCreateUser());
        dto.setPhone(account.getPhone());
        dto.setName(account.getNickName());

        return dto;
    }

}

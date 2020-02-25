package com.lizhi.xingbao.service;

import com.lizhi.xingbao.dto.FeedBackDto;

import java.util.List;

public interface FeedBackService {
    void add(String token,int type,String content);

    /**
     * 删除意见反馈
     * @param Id 大类 id
     */
    void deleteFeedBack(Integer Id);

    /**
     * 获取所有见反馈
     * @return
     */
    List<FeedBackDto> getAllFeedBack();
}

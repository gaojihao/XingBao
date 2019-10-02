package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.entity.Stared;
import com.lizhi.xingbao.request.StarRequest;
import com.lizhi.xingbao.respository.StaredRespository;
import com.lizhi.xingbao.service.StatedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StatedService")
public class StatedServiceImpl implements StatedService {
    private static final Logger logger = LoggerFactory.getLogger(StatedServiceImpl.class);

    @Autowired
    private StaredRespository staredRespository;

    @Override
    public void  updateStar(StarRequest request) {
        Stared res = staredRespository.findByUserIdAndCourse(request.getUserId(),request.getCourseId());

        if (res == null) {
            Stared stared = new Stared();
            stared.setCourse(request.getCourseId());
            stared.setUserId(request.getUserId());
        }else {
            throw new ParamException("您已点赞");
        }
    }
    @Override
    public void cancelStar(StarRequest request) {
        Stared res = staredRespository.findByUserIdAndCourse(request.getUserId(),request.getCourseId());

        if (res != null) {
            staredRespository.delete(res);
        }else {
            throw new ParamException("您还未点赞");
        }
    }

}

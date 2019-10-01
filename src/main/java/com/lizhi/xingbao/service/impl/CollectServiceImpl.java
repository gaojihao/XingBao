package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.CollectDto;
import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.entity.Collect;
import com.lizhi.xingbao.request.CollectRequest;
import com.lizhi.xingbao.respository.CollectRespository;
import com.lizhi.xingbao.service.CollectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("CollectService")
public class CollectServiceImpl implements CollectService {
    private static final Logger logger = LoggerFactory.getLogger(CollectServiceImpl.class);

    @Autowired
    private CollectRespository collectRespository;

    @Override
    public void updateCollect(CollectRequest request){
        Collect collect = new Collect();
        collect.setUserId(request.getUserId());
        collect.setCourse(request.getCourseId());

        Collect res = collectRespository.findByUserIdAndCourse(request.getUserId(),request.getCourseId());

        if (res == null){
            collectRespository.save(collect);
        }else {
            throw new ParamException("资源已收藏");
        }
    }

    @Override
    public void cancelCollect(CollectRequest request) {
        Collect res = collectRespository.findByUserIdAndCourse(request.getUserId(),request.getCourseId());

        if (res != null) {
            collectRespository.delete(res);
        }else {
            throw new ParamException("你还未收藏该资源");
        }
    }
}

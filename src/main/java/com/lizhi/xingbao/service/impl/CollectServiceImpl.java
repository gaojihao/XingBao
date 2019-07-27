package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.common.Exception.ParamException;
import com.lizhi.xingbao.dto.CollectDto;
import com.lizhi.xingbao.dto.CourseDto;
import com.lizhi.xingbao.entity.Collect;
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
    public void createCollect(CollectDto dto){
        Collect collect = new Collect();
        collect.setUserId(dto.getUserId());
        collect.setCourse(dto.getCourse());

        collectRespository.save(collect);

    }

    @Override
    public void deleteCollect(CollectDto dto){
        Collect collect = collectRespository.findByUserIdAndCourse(dto.getUserId(),dto.getCourse());
        if (collect == null){
            throw new ParamException("未找到该资源");
        }

        collectRespository.delete(collect);

    }

    @Override
    public List<CollectDto> getCollectByUserId(Integer userId, Pageable pageable){
        if (userId == null){
            throw new ParamException("参数错误");
        }

        List<Collect> list = collectRespository.findAllByUserId(userId, pageable);
        List<CollectDto> dtoList = new ArrayList<>();

        for (Collect collect : list){
            CollectDto dto = new CollectDto();
            dto.setCourse(collect.getCourse());
            dto.setUserId(collect.getUserId());
        }

        return dtoList;
    }
}

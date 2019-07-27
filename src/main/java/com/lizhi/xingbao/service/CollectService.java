package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.CollectDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CollectService {
    void createCollect(CollectDto dto);

    void deleteCollect(CollectDto dto);

    List<CollectDto> getCollectByUserId(Integer userId, Pageable pageable);
}

package com.lizhi.xingbao.service;


import com.lizhi.xingbao.dto.CollectDto;
import com.lizhi.xingbao.request.CollectRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CollectService {
    void updateCollect(CollectRequest request);

    List<CollectDto> getCollectByUserId(String userId, Pageable pageable);
}

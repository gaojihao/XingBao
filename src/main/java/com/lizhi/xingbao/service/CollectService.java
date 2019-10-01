package com.lizhi.xingbao.service;


import com.lizhi.xingbao.request.CollectRequest;

public interface CollectService {
    void updateCollect(CollectRequest request);

    void cancelCollect(CollectRequest request);
}

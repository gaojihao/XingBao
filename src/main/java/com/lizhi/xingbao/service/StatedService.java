package com.lizhi.xingbao.service;
import com.lizhi.xingbao.request.StarRequest;

public interface StatedService {
    void updateStar(StarRequest request);
    void cancelStar(StarRequest request);
}

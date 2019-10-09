package com.lizhi.xingbao.request;

import lombok.Data;

@Data
public class CollectRequest {
    private Integer courseId;
    private String userId;
    /**
     * 类型type 0:课程  1:文章
     */
    private int type;
}

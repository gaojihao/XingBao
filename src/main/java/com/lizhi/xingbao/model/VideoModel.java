package com.lizhi.xingbao.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class VideoModel implements Serializable {

    /**
     * 标题
     */
    private String title;

    /**
     * 资源地址
     */
    private String url;

    /**
     * 时长
     */
    private Integer duration;

    /**
     * 所属课程
     */
    private Integer course;

    /**
     * ID
     */
    private Integer videoId;
}

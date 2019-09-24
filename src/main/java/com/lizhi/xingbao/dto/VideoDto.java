package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class VideoDto implements Serializable {
    private static final long serialVersionUID = -9117189722283200408L;

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

    private Integer videoId;
}

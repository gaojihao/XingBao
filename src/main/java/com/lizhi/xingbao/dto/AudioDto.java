package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AudioDto implements Serializable {
    private static final long serialVersionUID = 5861159903346986971L;

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


    private Integer audioId;
}

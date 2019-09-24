package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StaredDto implements Serializable {
    private static final long serialVersionUID = -9167770132750087726L;

    /**
     * 所属个人
     */
    private String userId;

    /**
     *所属课程
     */
    private Integer course;
}

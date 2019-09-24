package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CollectDto implements Serializable {
    private static final long serialVersionUID = 8100630764832362134L;

    /**
     * 所属个人
     */
    private String userId;

    /**
     *所属课程
     */
    private Integer course;
}

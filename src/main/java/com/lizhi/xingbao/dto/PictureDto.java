package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureDto implements Serializable {
    private static final long serialVersionUID = -7607958846578560681L;

    /**
     * 名称
     */
    private String filename;

    /**
     * 尺寸
     */
    private String size;

    /**
     * 高
     */
    private Integer height;

    /**
     * 宽
     */
    private Integer width;

    /**
     * 链接
     */
    private String url;
}

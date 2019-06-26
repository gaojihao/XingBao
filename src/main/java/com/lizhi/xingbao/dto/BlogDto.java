package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BlogDto implements Serializable {
    private static final long serialVersionUID = 4534744682807219623L;

    private String title;

    private String url;

    private Integer readNum;

    private String summary;

    private String content;
}

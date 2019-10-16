package com.lizhi.xingbao.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PostModel implements Serializable {

    private String title;

    private String url;

    private Integer readNum;

    private String cover;

    private String summary;

    private String content;

    private Integer blogId;
}

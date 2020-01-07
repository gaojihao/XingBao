package com.lizhi.xingbao.dto;


import java.io.Serializable;

public class TagDto implements Serializable {
    private static final long serialVersionUID = 1536690177757653116L;

    private String name;

    private Integer tagId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}

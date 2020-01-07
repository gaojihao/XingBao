package com.lizhi.xingbao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "picture")

public class Picture extends BaseEntity {

    private static final long serialVersionUID = -2416730922565709707L;

    /**
     * 名称
     */
    @Column(name = "filename")
    private String filename;

    /**
     * 高
     */
    @Column(name = "height")
    private Integer height;

    /**
     * 宽
     */
    @Column(name = "width")
    private Integer width;

    /**
     * 链接
     */
    @Column(name = "url")
    private String url;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

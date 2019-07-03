package com.lizhi.xingbao.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "picture")
public class Picture extends BaseEntity {

    private static final long serialVersionUID = -2416730922565709707L;

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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    @Override
    public String toString() {
        return "Picture{" +
                "filename='" + filename + '\'' +
                ", size='" + size + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", url='" + url + '\'' +
                '}';
    }
}

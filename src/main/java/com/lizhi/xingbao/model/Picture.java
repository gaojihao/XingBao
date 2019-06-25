package com.lizhi.xingbao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "picture")
public class Picture extends BaseEntity {

    private static final long serialVersionUID = -2416730922565709707L;
    private String filename;

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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    private String size;

    private String height;

    private String width;


}

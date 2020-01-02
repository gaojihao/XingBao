package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "picture")
@EqualsAndHashCode(callSuper = false)
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
}

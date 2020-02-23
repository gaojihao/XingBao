package com.lizhi.xingbao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Aaron
 */
@Entity
@Table(name = "message")
public class Message extends BaseEntity {

    /**
     * 内容
     */
    @Column(name = "content")
    private String content;

    @Column(name = "url")
    private String url;

    @Column(name = "recviver")
    private String recviver;

    @Column(name = "type")
    private int type;

    @Column(name = "read")
    private boolean read;

}

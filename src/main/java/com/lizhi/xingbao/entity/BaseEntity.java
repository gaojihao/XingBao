package com.lizhi.xingbao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1782474744437162148L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "create_time",nullable = false, updatable = false)
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private String createTime;

    @Column(name = "update_time")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private String updateTime;
}

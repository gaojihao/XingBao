package com.lizhi.xingbao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1782474744437162148L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "create_time",nullable = false, updatable = false)
    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Long createTime;

    @Column(name = "update_time")
    @LastModifiedDate
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Long updateTime;

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) { Id = id; }
}

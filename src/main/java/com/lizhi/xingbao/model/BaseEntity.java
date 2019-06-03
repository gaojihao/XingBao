package com.lizhi.xingbao.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    private Date createTime;

    @Column(name = "update_time")
    @LastModifiedDate
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateTime;

    private Boolean delete_flag = false;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) { Id = id; }


    public Boolean getDelete_flag() { return delete_flag; }

    public void setDelete_flag(Boolean delete_flag) { this.delete_flag = delete_flag; }
}

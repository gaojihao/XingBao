package com.lizhi.xingbao.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "create_time")
    @CreatedDate
    private Date createTime;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;

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

    private Boolean delete_flag = false;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) { Id = id; }


    public Boolean getDelete_flag() { return delete_flag; }

    public void setDelete_flag(Boolean delete_flag) { this.delete_flag = delete_flag; }
}

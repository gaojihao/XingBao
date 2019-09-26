package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tag")
@EqualsAndHashCode(callSuper = false)
public class Tag extends BaseEntity{

    private static final long serialVersionUID = -4634788068753143904L;

    @Column(name = "name")
    private String name;

}

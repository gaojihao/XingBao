package com.lizhi.xingbao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "course")
@EqualsAndHashCode(callSuper = false)
public class Course extends BaseEntity{

    private static final long serialVersionUID = -5960960584954140332L;
    /**
     * 名称
     */
    @Column(name = "title", nullable = false,length = 50)
    private String title;

    /**
     *摘要
     */
    @Column(name = "summary", nullable = false,length = 128)
    private String summary;

    /**
     * 描述
     */
    @Column(name = "course_desc")
    private String desc;

    /**
     * 子标题
     */
    @Column(name = "sub_title")
    private String subTitle;

    /**
     * 封面图标
     */
    @Column(name = "cover_image")
    private String coverImage;

    /**
     * 所属分类ID
     */
    @Column(name = "category")
    private Integer category;

    /**
     * 所属分类名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 实际价格
     */
    @Column(name = "realPrice")
    private Integer realPrice;

    /**
     * 市场价格
     */
    @Column(name = "price")
    private Integer price;

    /**
     * 购买人数
     */
    @Column(name = "buyCount")
    private Integer buyCount;

    /**
     * 评分
     */
    @Column(name = "grade")
    private float grade;

    /**
     * 类型
     */
    @Column(name = "course_type")
    private Integer type;
}

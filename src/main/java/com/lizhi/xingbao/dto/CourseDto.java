package com.lizhi.xingbao.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseDto implements Serializable {
    private static final long serialVersionUID = 660510066789693598L;

    /**
     * 名称
     */
    private String title;

    /**
     *摘要
     */
    private String summary;

    /**
     * 描述
     */
    private String desc;

    /**
     * 子标题
     */
    private String subTitle;

    /**
     * 封面图标
     */
    private String coverImage;

    /**
     * 所属分类ID
     */
    private Integer category;

    /**
     * 实际价格
     */
    private Integer realPrice;

    /**
     * 市场价格
     */
    private Integer price;

    /**
     * 购买人数
     */
    private Integer buyCount;

    /**
     * 评分
     */
    private float grade;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 课程Id
     */
    private Integer courseId;
}

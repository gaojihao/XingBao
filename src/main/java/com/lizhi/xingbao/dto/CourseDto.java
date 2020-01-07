package com.lizhi.xingbao.dto;


import java.io.Serializable;

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

    private Boolean published;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Integer realPrice) {
        this.realPrice = realPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }
}

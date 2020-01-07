package com.lizhi.xingbao.request;


/**
 * @author Aaron
 */

public class StarRequest {

    private Integer courseId;
    private String userId;

    /**
     * 类型type 0:课程  1:文章
     */
    private int type;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

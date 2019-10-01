package com.lizhi.xingbao.request;

import com.lizhi.xingbao.annotation.Query;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseQueryCriteria {
    @Query
    private Integer categoryId;
}

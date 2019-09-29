package com.lizhi.xingbao.request;

import com.lizhi.xingbao.annotation.Query;
import lombok.Data;

@Data
public class AudioQueryCriteria {

    @Query
    private Integer course;
}

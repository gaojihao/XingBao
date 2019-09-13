package com.lizhi.xingbao.common.result;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class PagedResult<T> extends BaseResult<List<T>> {

    private static final long serialVersionUID = 8860985209831509012L;

    private Integer totalCount;

    private Integer totalPage;

    public PagedResult setTotalCount(int totalCount, int itemPerPage) {
        this.totalCount = totalCount;
        this.totalPage = totalCount / itemPerPage + (totalCount % itemPerPage == 0? 0 : 1);
        return this;
    }

    @Override
    public List<T> getData() {
        return super.getData();
    }
}

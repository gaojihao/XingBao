package com.lizhi.xingbao.common.request.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class MarkerPaged extends BasePaged {

    private static final long serialVersionUID = -4637211484393863203L;

    /**
     * 分页查询开始标识
     */
    private String marker;

    /**
     * 是否向前查询
     * forward = true,marker=null 表示查第一页
     * forward = true,marker="xxxxxx" 表示查以xxxxxx开始的下一页
     * forward = false,marker=null 表示查最后一页
     * forward = false,marker="xxxxxx" 表示查以xxxxxx结束的上一页
     */
    private boolean forward;

    public MarkerPaged() {

    }

    public MarkerPaged(String marker, boolean forward, int itemsPerPage) {
        this.setPage(marker, forward, itemsPerPage);
    }

    public MarkerPaged setPage(String marker, boolean forward, int itemsPerPage){
        this.marker = marker;
        this.forward = forward;
        super.setItemsPerPage(itemsPerPage);
        return this;
    }
}

package com.lizhi.xingbao.common.request.query;

import com.lizhi.xingbao.common.Exception.IllegalParameterException;
import lombok.Data;
import static com.lizhi.xingbao.common.Exception.SimpleAssert.assertThat;
import static com.lizhi.xingbao.common.Exception.SimpleAssert.buildPara;

import java.io.Serializable;
@Data
public abstract class BasePaged implements Serializable {
    public final static int DEFAULT_ITEMS_FOR_PAGE = 100;
    public final static int MAX_ITEMS_FOR_PAGE = 1000;

    private int itemsPerPage = DEFAULT_ITEMS_FOR_PAGE;

    public void validate(String parentPara) throws IllegalParameterException {
        assertThat(buildPara(parentPara,"itemsPerPage"),
                this.itemsPerPage > 0 && this.itemsPerPage <= MAX_ITEMS_FOR_PAGE,
                String.format("in number range[%d ~ %d]",1,MAX_ITEMS_FOR_PAGE));
    }
}

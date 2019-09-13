package com.lizhi.xingbao.common.request.query;

import com.lizhi.xingbao.common.Exception.IllegalParameterException;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import static com.lizhi.xingbao.common.Exception.SimpleAssert.assertThat;
import static com.lizhi.xingbao.common.Exception.SimpleAssert.buildPara;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class NormalPaged extends BasePaged {

    private static final long serialVersionUID = -7246012034971217725L;

    /**
     * 查询第 page 页
     */
    private int page;

    /**
     * 是否计算符合记录的总记录数
     */
    private boolean countItems = true;

    public NormalPaged(){

    }

    public NormalPaged(int page, int itemPerPage) {
        this.setPage(page, itemPerPage);
    }

    public NormalPaged setPage(int page, int itemPerPage) {
        this.page = page;
        super.setItemsPerPage(itemPerPage);
        return this;
    }

    @Override
    public void validate(String parentPara) throws IllegalParameterException {
        super.validate(parentPara);
        assertThat(buildPara(parentPara,"page"),this.page > 0, "greater than zero");
    }

    public long findStart(){
        return (this.page - 1L) * this.getItemsPerPage();
    }
}

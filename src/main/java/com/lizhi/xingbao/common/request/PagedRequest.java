package com.lizhi.xingbao.common.request;

import com.lizhi.xingbao.common.Exception.IllegalParameterException;
import com.lizhi.xingbao.common.request.query.NormalPaged;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class PagedRequest <Q> extends BaseRequest<Q> {

    private NormalPaged paged;

    public PagedRequest (String requestId, String caller) {
        super(requestId, caller);
    }

    public PagedRequest setPage(int currentPage, int pageSize) {
        this.paged = new NormalPaged(currentPage,pageSize);
        return this;
    }

    @Override
    public void validate() throws IllegalParameterException {
        super.validate();
        if (paged != null) {
            this.paged.validate("paged");
        }
    }

    @Override
    public PagedRequest<Q> setRequestId(String requestId) {
        return (PagedRequest)super.setRequestId(requestId);
    }

    @Override
    public PagedRequest<Q> setCaller(String caller) {
        return (PagedRequest)super.setCaller(caller);
    }

    @Override
    public PagedRequest<Q> setQuery(Q query) {
        return (PagedRequest)super.setQuery(query);
    }
}

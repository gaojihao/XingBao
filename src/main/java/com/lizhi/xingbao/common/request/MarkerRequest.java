package com.lizhi.xingbao.common.request;

import com.lizhi.xingbao.common.Exception.IllegalParameterException;
import com.lizhi.xingbao.common.request.query.MarkerPaged;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class MarkerRequest <Q> extends BaseRequest<Q> {

    private MarkerPaged paged;

    public MarkerRequest(String requestId, String caller) {
        super(requestId, caller);
    }

    public MarkerRequest setPage(String marker, boolean forward, int pageSize) {
        this.paged = new MarkerPaged(marker,forward,pageSize);
        return  this;
    }

    @Override
    public void validate() throws IllegalParameterException {
        super.validate();

        this.paged.validate("paged");
    }

    @Override
    public MarkerRequest<Q> setRequestId(String requestId) {
        return (MarkerRequest)super.setRequestId(requestId);
    }

    @Override
    public MarkerRequest<Q> setCaller(String caller) {
        return (MarkerRequest)super.setCaller(caller);
    }

    @Override
    public MarkerRequest<Q> setQuery(Q query) {
        return (MarkerRequest)super.setQuery(query);
    }
}

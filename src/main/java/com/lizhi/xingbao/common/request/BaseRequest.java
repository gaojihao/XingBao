package com.lizhi.xingbao.common.request;

import com.lizhi.xingbao.common.Exception.IllegalParameterException;
import lombok.Data;
import lombok.experimental.Accessors;
import com.lizhi.xingbao.common.request.query.IQuery;

import java.io.Serializable;
@Data
@Accessors(chain = true)
public class BaseRequest<Q> implements Serializable {

    private String requestId;

    private String caller;

    private Q query;

    public BaseRequest(String requestId, String caller) {
        this.requestId = requestId;
        this.caller = caller;
    }

    public void validate() throws IllegalParameterException {
        if (this.query instanceof IQuery){
            ((IQuery) this.query).validate();
        }
    }
}

package com.lizhi.xingbao.common.result;

import com.lizhi.xingbao.common.Exception.ApiException;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.function.Function;

import static com.lizhi.xingbao.common.ErrorCode.INTERNAL_CODE;
import static com.lizhi.xingbao.common.ErrorCode.SUCCESS_CODE;

@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class BaseResult<D> implements Serializable {
    private static final long serialVersionUID = 1773355330028149124L;
    @Getter
    @Setter
    private String code  =SUCCESS_CODE;

    @Getter
    @Setter
    private String message;

    @Getter
    private D data;

    public BaseResult() {

    }

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }

    public BaseResult setData(D data) {
        if (data != null && !(data instanceof  Serializable)) {
            throw new RuntimeException("the result data should be a Serializable");
        }

        this.data = data;

        return this;
    }

    public BaseResult setException(Exception e, Function<Exception, String> function) {
        if (e instanceof ApiException) {
            this.code = ((ApiException) e).getErrorCode();
        }else {
            this.code = function == null? INTERNAL_CODE:function.apply(e);
        }

        this.message = e.getMessage();

        return this;
    }

}

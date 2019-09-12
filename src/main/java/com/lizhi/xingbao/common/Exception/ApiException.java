package com.lizhi.xingbao.common.Exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class ApiException extends RuntimeException {

    private String errorCode;

    public ApiException(String errorCode) {
        this.errorCode = errorCode;
    }

    public ApiException(String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ApiException(String errorCode,String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ApiException(String errorCode,Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ApiException(String errorCode,String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }
}

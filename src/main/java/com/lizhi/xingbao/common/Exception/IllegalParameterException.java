package com.lizhi.xingbao.common.Exception;
import static com.lizhi.xingbao.common.ErrorCode.ILLEGAL_PARAMETER_CODE;

public class IllegalParameterException extends ApiException {

    public IllegalParameterException() {
        super(ILLEGAL_PARAMETER_CODE);
    }

    public IllegalParameterException(String message) {
        super(ILLEGAL_PARAMETER_CODE, message);
    }

    public IllegalParameterException(String message, Throwable cause) {
        super(ILLEGAL_PARAMETER_CODE, message, cause);
    }

    public IllegalParameterException(Throwable cause) {
        super(ILLEGAL_PARAMETER_CODE, cause);
    }

    public IllegalParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(ILLEGAL_PARAMETER_CODE,message, cause, enableSuppression, writableStackTrace);
    }
}

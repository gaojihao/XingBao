package com.lizhi.xingbao.common.Exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RuntimeException {

    private Integer status = 400;

    public BadRequestException(String msg){
        super(msg);
    }

    public BadRequestException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }

    public Integer getStatus() {
        return status;
    }
}

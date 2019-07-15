package com.lizhi.xingbao.common.Exception;

import com.lizhi.xingbao.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Result> handleUnhandledException() {
        return ResponseEntity.ok(Result.UNKOWN_ERROR);
    }


    @ExceptionHandler(ParamException.class)
    public ResponseEntity<Result> handleParamException(HttpServletRequest request,ParamException e){
        logger.error(e.getMessage(), e);
        return ResponseEntity.ok(new Result(e.getCode(), e.getMessage()));
    }


    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Result> handleBadRequestException(HttpServletRequest request,BadRequestException e){
        logger.error(e.getMessage(), e);
        return ResponseEntity.ok(new Result(e.getStatus(), e.getMessage()));
    }

    @ExceptionHandler(ServerException.class)
    public ResponseEntity<Result> handleServerException(HttpServletRequest request,ServerException e){
        logger.error(e.getMessage(), e);
        return ResponseEntity.ok(new Result(e.getCode(), e.getMessage()));
    }


}

package com.lizhi.xingbao.utils;

import com.lizhi.xingbao.common.Exception.ServerException;
import java.util.Optional;

public class ValidationUtil {

    public static void isNull(Optional optional,String entity,String parameter , Object value) {
        if (!optional.isPresent()){
            String msg = entity
                    + " 不存在 "
                    +"{ "+ parameter +":"+ value.toString() +" }";
            throw new  ServerException(msg);
        }
    }
}

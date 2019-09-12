package com.lizhi.xingbao.common.request.query;

import com.lizhi.xingbao.common.Exception.IllegalParameterException;

import java.io.Serializable;

public interface IQuery extends Serializable {

    void validate() throws IllegalParameterException;

    final class EmptyQuery implements IQuery {
        @Override
        public void validate() throws IllegalParameterException {

        }
    }
}

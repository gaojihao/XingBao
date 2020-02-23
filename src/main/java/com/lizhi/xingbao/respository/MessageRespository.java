package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MessageRespository extends JpaRepository<Message,Integer>, JpaSpecificationExecutor {

}

package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<Account,Integer> {

}

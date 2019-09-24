package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<Account,Integer> {

    /**
     * 检测用户是否存在
     * @param phone 用户手机号
     * @return 存在true 不存在false
     */
    Account findAccountByPhoneEquals(String phone);

    Account findAccountByUserIdEquals(String userId);

}

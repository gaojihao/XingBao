package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Integer> {
}

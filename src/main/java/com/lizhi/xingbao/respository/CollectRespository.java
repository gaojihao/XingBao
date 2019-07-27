package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Collect;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollectRespository extends JpaRepository<Collect,Integer> {
    List<Collect> findAllByUserId(Integer userId, Pageable pageable);
}

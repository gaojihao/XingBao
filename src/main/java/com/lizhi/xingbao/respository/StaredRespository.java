package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Stared;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaredRespository extends JpaRepository<Stared,Integer> {

    Stared findByUserIdAndCourse(String userId, Integer courseId);
}

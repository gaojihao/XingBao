package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface AudioRespository extends JpaRepository<Audio,Integer>, JpaSpecificationExecutor {
    Audio findByUrl(String url);

    List<Audio> findAllByCourse(Integer courseId);
}

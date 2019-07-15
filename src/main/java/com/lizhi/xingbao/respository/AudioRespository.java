package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Audio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AudioRespository extends JpaRepository<Audio,Integer> {
    Audio findByUrl(String url);

    List<Audio> findAllByCourse(Integer courseId);
}

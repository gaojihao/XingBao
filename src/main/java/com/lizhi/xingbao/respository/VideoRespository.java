package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Video;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRespository extends JpaRepository<Video,Integer> {

    Video findByUrl(String url);

    List<Video> queryAllByCourse(Integer course);
}

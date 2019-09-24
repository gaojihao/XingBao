package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRespository extends JpaRepository<Blog,Integer>{

    Blog findByUrl(String url);


}

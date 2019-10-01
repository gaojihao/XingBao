package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BlogRespository extends JpaRepository<Blog,Integer>, JpaSpecificationExecutor {

    Blog findByUrl(String url);


}

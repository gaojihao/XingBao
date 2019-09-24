package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PictureRepository extends JpaRepository<Picture,Integer>, JpaSpecificationExecutor {
}

package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Picture;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PictureRepository extends PagingAndSortingRepository<Picture,Integer> {
}

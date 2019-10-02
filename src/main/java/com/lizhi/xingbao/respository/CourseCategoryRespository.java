package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseCategoryRespository extends JpaRepository<CourseCategory,Integer> {
    CourseCategory findByName(String name);
}

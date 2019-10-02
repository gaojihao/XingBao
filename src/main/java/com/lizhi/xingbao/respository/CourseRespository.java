package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRespository extends JpaRepository<Course,Integer>, JpaSpecificationExecutor {
    Course findByTitle(String title);
}

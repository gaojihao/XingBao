package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRespository extends JpaRepository<Course,Integer> {
}

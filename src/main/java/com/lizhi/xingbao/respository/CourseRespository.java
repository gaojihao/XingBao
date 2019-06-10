package com.lizhi.xingbao.respository;

import com.lizhi.xingbao.model.Course;
import com.lizhi.xingbao.model.CourseCategoty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRespository extends JpaRepository<Course,Integer> {
}

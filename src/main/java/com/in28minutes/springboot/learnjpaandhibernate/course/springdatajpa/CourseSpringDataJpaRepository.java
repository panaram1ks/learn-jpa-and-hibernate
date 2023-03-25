package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.CourseJPA;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseSpringDataJpaRepository extends JpaRepository<CourseJPA, Long> {


}

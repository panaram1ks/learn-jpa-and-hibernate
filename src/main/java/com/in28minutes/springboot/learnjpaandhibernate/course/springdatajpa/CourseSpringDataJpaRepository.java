package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.CourseJPA;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseSpringDataJpaRepository extends JpaRepository<CourseJPA, Long> {

        List<CourseJPA> findByAuthor(String author);

        List<CourseJPA> findByName(String name);
}

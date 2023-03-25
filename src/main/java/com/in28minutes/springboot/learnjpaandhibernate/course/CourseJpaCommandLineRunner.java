package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new CourseJPA(4l, "Learn AWS 1", "in28minutes"));
        courseJdbcRepository.insert(new CourseJPA(5l, "Learn Azure 1", "in28minutes"));
        courseJdbcRepository.insert(new CourseJPA(6l, "Learn DevOps 1", "in28minutes"));
        courseJdbcRepository.deleteById(5l);
        CourseJPA course = courseJdbcRepository.findById(5l);
        System.out.println(course);


    }

}

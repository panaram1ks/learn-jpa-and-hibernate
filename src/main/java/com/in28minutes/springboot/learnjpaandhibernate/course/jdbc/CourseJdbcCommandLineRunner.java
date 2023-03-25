package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1l, "Learn AWS 1", "in28minutes"));
        courseJdbcRepository.insert(new Course(2l, "Learn Azure 1", "in28minutes"));
        courseJdbcRepository.insert(new Course(3l, "Learn DevOps 1", "in28minutes"));
        courseJdbcRepository.deleteById(2l);
        Course course = courseJdbcRepository.findById(3l);
        System.out.println(course);


    }

}

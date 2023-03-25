package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new CourseJPA(4l, "Learn AWS 1", "in28minutes"));
        repository.save(new CourseJPA(5l, "Learn Azure 1", "in28minutes"));
        repository.save(new CourseJPA(6l, "Learn DevOps 1", "in28minutes"));

        repository.deleteById(5l);

        Optional<CourseJPA> course = repository.findById(6l);
        System.out.println(course.get());

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByName("Learn AWS 1"));

    }
}

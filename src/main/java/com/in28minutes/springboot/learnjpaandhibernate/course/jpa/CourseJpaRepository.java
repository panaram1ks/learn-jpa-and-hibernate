package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.CourseJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

//    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(CourseJPA courseJPA){
        entityManager.merge(courseJPA);
    }

    public CourseJPA findById(long id){
        return entityManager.find(CourseJPA.class, id);
    }

    public void deleteById(long id){
        CourseJPA courseJPA = findById(id);
        entityManager.remove(courseJPA);
    }


}

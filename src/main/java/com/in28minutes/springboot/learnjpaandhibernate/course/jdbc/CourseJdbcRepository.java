package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course(id, name, author)
                values(?, ?, ?);          
            """;

    private static String DELETE_BY_ID =
            """
                delete from course
                where id = ?;
            """;

    private static String SELECT_BY_ID =
            """
                SELECT * FROM COURSE
                WHERE id = ?;
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_BY_ID, id);
    }

    public Course findById(long id){
       return springJdbcTemplate.queryForObject(SELECT_BY_ID, new BeanPropertyRowMapper<>(Course.class), id);
       //ResultSet -> Bean => RowMapper =>
        //id
    }

}

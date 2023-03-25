package com.in28minutes.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseJPA {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    public CourseJPA() {
    }

    public CourseJPA(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "CourseJPA{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", author='" + author + '\'' +
               '}';
    }
}

package com.practice.jpahibernate.jpaandhibernatedemo.entity;

import jakarta.persistence.*;

@Entity
//@Table(name="CourseDetails")
public class Course {

    @Id
    @GeneratedValue
    private Long id;

//    @Column(name="fullname", nullable = false)
    private String name;

    public Course() {
    }

    public Course(String name){
        this.name=name;
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

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}

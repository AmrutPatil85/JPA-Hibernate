package com.practice.jpahibernate.jpaandhibernatedemo.repository;

import com.practice.jpahibernate.jpaandhibernatedemo.entity.Course;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager manager;

    //public Course findById(Long id)
    public Course findById(Long id){
        return manager.find(Course.class,id);
    }
    //public Course save(Course course)  -> insert or update
    public Course save(Course course) {

        if (course.getId() == null) {
            manager.persist(course);
        } else {
            manager.merge(course);
        }

//        if (course.getId() == null) {
//            manager.persist(course);
//        } else {
//            manager.merge(course);
//        }

        return course;
    }
    //public void deleteById(Long id)
    public void deleteById(Long id){
        Course course = findById(id);
        manager.remove(course);
    }

    public void playWithEntityManager(){
        logger.info("playWithEntityManager -  start");
        Course course = new Course("Web Services in 50 Steps");
        manager.persist(course);
        course.setName("Web Services in 50 Steps - Updated");
        manager.flush();
//        manager.detach();
    }

}

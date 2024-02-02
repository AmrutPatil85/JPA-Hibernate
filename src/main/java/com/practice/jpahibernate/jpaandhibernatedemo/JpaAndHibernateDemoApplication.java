package com.practice.jpahibernate.jpaandhibernatedemo;

import com.practice.jpahibernate.jpaandhibernatedemo.entity.Course;
import com.practice.jpahibernate.jpaandhibernatedemo.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaAndHibernateDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(JpaAndHibernateDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.playWithEntityManager();
//		Course course = repository.findById(10001L);
//		logger.info("Course 10001 -> {}",course);
//		repository.save(new Course("Microservices in 50 Steps"));
	}
}

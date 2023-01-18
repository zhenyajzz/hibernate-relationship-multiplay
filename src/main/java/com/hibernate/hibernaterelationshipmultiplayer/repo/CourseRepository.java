package com.hibernate.hibernaterelationshipmultiplayer.repo;

import com.hibernate.hibernaterelationshipmultiplayer.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}

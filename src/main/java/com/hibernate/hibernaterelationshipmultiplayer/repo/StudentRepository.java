package com.hibernate.hibernaterelationshipmultiplayer.repo;

import com.hibernate.hibernaterelationshipmultiplayer.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByName(String name);

    public List<Student> findByAgeLessThan(Integer number);

    public List<Student> findByAgeGreaterThan(Integer number);

    public List<Student> findByNameContaining(String letter);

    public List<Student> findByNameNot(String name);
}

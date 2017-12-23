package com.sprot.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sport.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}

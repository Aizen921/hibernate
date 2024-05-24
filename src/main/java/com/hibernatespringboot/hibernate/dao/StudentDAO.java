package com.hibernatespringboot.hibernate.dao;

import com.hibernatespringboot.hibernate.entinties.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student,Long> {
}

package com.hibernatespringboot.hibernate.dao;

import com.hibernatespringboot.hibernate.entinties.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentDAO extends JpaRepository<Enrollment, Long> {
}

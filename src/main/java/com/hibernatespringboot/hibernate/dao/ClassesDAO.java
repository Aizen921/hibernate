package com.hibernatespringboot.hibernate.dao;

import com.hibernatespringboot.hibernate.entinties.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesDAO extends JpaRepository<Classes,Long> {
}

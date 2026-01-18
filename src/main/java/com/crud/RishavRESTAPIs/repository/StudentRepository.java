package com.crud.RishavRESTAPIs.repository;

import com.crud.RishavRESTAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

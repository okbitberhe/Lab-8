package com.example.eRegistrar.repository;

import com.example.eRegistrar.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {


}

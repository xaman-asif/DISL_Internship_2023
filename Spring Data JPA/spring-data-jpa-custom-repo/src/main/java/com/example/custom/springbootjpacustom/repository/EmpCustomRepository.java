package com.example.custom.springbootjpacustom.repository;

import com.example.custom.springbootjpacustom.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpCustomRepository {
    List<Employee> findByFirstName(String firstname);
}

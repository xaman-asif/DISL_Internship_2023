package com.example.custom.springbootjpacustom.repository;

import com.example.custom.springbootjpacustom.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, EmpCustomRepository {

}

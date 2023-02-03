package com.example.springdatajpaquery.repository;

import com.example.springdatajpaquery.model.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //JPQL with named parameters
    @Query("SELECT e from Employee e where e.firstName=:firstname")
    List<Employee> findByFirstName(@Param("firstname") String firstName, Sort sort);

    //JPQL with index parameters
    @Query("SELECT e from Employee e where e.firstName=?1 and e.department=?2")
    List<Employee> findByFirstNamewithIndexParam(String firstName, String department);

    //Native SQL with named parameters
    @Query(value = "SELECT * from Employee e where e.last_name=:lastname", nativeQuery = true)
    List<Employee> findByLastName(@Param("lastname") String lastname);

    //Native SQL with Index parameters
    @Query(value = "SELECT * from Employee e where e.last_name= ?1 and e.department= ?2", nativeQuery = true)
    List<Employee> findByLastNamewithIndexParam(String lastname, String department);
}
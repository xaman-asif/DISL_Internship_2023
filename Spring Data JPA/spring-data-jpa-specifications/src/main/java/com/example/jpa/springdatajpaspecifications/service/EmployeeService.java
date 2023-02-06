package com.example.jpa.springdatajpaspecifications.service;

import com.example.jpa.springdatajpaspecifications.model.Employee;
import com.example.jpa.springdatajpaspecifications.repository.BookRepository;
import com.example.jpa.springdatajpaspecifications.repository.EmployeeRepository;
import com.example.jpa.springdatajpaspecifications.specifications.EmployeeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.springframework.data.jpa.domain.Specification.where;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> findByFirstnameAndDepartment(
            @PathVariable("firstname") String firstname,
            @PathVariable("department") String department
    ) {
        return employeeRepository.findAll(
                where(EmployeeSpecification.hasFirstName(firstname)
                        .and(EmployeeSpecification.hasDepartment(department))
                )
        );
    }

    public List<Employee> searchByLastName(@PathVariable("lastname") String lastname) {
        return employeeRepository.findAll(
                EmployeeSpecification.containsLastName(lastname)
        );
    }

    public List<Employee> searchByFirstName(@PathVariable("firstname") String firstname) {
        return employeeRepository.findAll(
                EmployeeSpecification.containsFirstName(firstname)
        );
    }
}

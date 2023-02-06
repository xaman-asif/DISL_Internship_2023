package com.example.jpa.springdatajpaspecifications.controller;

import com.example.jpa.springdatajpaspecifications.model.Employee;
import com.example.jpa.springdatajpaspecifications.repository.EmployeeRepository;
import com.example.jpa.springdatajpaspecifications.service.EmployeeService;
import com.example.jpa.springdatajpaspecifications.specifications.EmployeeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static com.example.jpa.springdatajpaspecifications.specifications.EmployeeSpecification.containsLastName;
import static com.example.jpa.springdatajpaspecifications.specifications.EmployeeSpecification.hasFirstName;
import static org.springframework.data.jpa.domain.Specification.where;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> findAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("/{firstname}/{department}")
    public List<Employee> findByFirstnameAndDepartment(
            @PathVariable("firstname") String firstname,
            @PathVariable("department") String department
    ) {
        return employeeService.findByFirstnameAndDepartment(firstname, department);
    }

    @GetMapping("/search/lastname/{lastname}")
    public List<Employee> searchByLastName(@PathVariable("lastname") String lastname) {
        return employeeService.searchByLastName(lastname);
    }

    @GetMapping("/search/firstname/{firstname}")
    public List<Employee> searchByFirstName(@PathVariable("firstname") String firstname) {
        return employeeService.searchByFirstName(firstname);
    }
}
package com.example.springdatajpaquery.controller;

import com.example.springdatajpaquery.model.Employee;
import com.example.springdatajpaquery.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/firstname/{firstname}")
    public List<Employee> findByFirstName(@PathVariable("firstname") String firstname) {
        return employeeRepository.findByFirstName(firstname, Sort.by("department").descending());
    }

    @GetMapping("/employees/firstname/{firstname}/{department}")
    public List<Employee> findByFirstNamewithIndex(@PathVariable("firstname") String firstname, @PathVariable("department") String department) {
        return employeeRepository.findByFirstNamewithIndexParam(firstname, department);
    }

    @GetMapping("/employees/lastname/{lastname}")
    public List<Employee> findByLastName(@PathVariable("lastname") String lastname) {
        return employeeRepository.findByLastName(lastname);
    }

    @GetMapping("/employees/lastname/{lastname}/{department}")
    public List<Employee> findByLastNamewithIndex(@PathVariable("lastname") String lastname, @PathVariable("department") String department) {
        return employeeRepository.findByLastNamewithIndexParam(lastname, department);
    }


}
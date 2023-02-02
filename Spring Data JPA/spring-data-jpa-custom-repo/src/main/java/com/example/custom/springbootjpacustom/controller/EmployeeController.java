package com.example.custom.springbootjpacustom.controller;

import com.example.custom.springbootjpacustom.model.Employee;
import com.example.custom.springbootjpacustom.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/employees/{firstname}")
    public List<Employee> findByFirstName(@PathVariable("firstname") String firstname) {
        return employeeRepository.findByFirstName(firstname);
    }
}

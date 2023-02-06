package com.example.jpa.springdatajpaspecifications.repository;

import com.example.jpa.springdatajpaspecifications.model.Employee;
import com.example.jpa.springdatajpaspecifications.model.Employee_;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeCustomRepositoryImpl implements EmployeeCustomRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findByFirstNameAndDepartment(String firstname, String department) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

        Root<Employee> employee = criteriaQuery.from(Employee.class);

        Predicate firstNamePredicate = criteriaBuilder.equal(employee.get(Employee_.FIRSTNAME), firstname);
        Predicate departmentPredicate = criteriaBuilder.equal(employee.get(Employee_.DEPARTMENT),department);

        criteriaQuery.where(firstNamePredicate,departmentPredicate);

        TypedQuery<Employee> query = entityManager.createQuery(criteriaQuery);

        return query.getResultList();
    }
}
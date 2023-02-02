package com.example.custom.springbootjpacustom.repository;

import com.example.custom.springbootjpacustom.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmpCustomRepositoryImpl implements EmpCustomRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findByFirstName(String firstname) {
        String sql = "select e from Employee e where e.firstName = :firstname";
        final TypedQuery<Employee> query =
                entityManager.createQuery(sql, Employee.class);
        query.setParameter("firstname", firstname);
        return query.getResultList();
    }
}

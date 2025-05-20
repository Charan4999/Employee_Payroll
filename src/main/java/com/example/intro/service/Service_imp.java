package com.example.intro.service;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public abstract class Service_imp implements service {

    private List<Model> employeeList = new ArrayList<>();
    private int currentId = 1;

    @Override
    public List<Model> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Model getEmployeeById(int empId) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Model createEmployee(dto dto) {
        Model emp = new Model(currentId++, dto.getName(), dto.getSalary());
        employeeList.add(emp);
        return emp;
    }

    @Override
    public Model updateEmployee(int empId, dto dto) {
        Model emp = getEmployeeById(empId);
        if (emp != null) {
            emp.setName(dto.getName());
            emp.setSalary(dto.getSalary());
        }
        return emp;
    }

    @Override
    public void deleteEmployee(int empId) {
        employeeList.removeIf(emp -> emp.getId() == empId);
    }
}
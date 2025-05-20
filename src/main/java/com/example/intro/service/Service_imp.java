package com.example.intro.service;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import com.example.intro.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_imp implements service {

    @Autowired
    private repository repository;

    @Override
    public List<Model> getAllEmployees() {
        return repository.findAll(); 
    }

    @Override
    public Model getEmployeeById(int empId) {
        return repository.findById(empId).orElse(null); 
    }

    @Override
    public Model createEmployee(dto dto) {
        Model emp = new Model();
        emp.setName(dto.getName());
        emp.setSalary(dto.getSalary());
        return repository.save(emp); 
    }

    @Override
    public Model updateEmployee(int empId, dto dto) {
        Model emp = getEmployeeById(empId);
        if (emp != null) {
            emp.setName(dto.getName());
            emp.setSalary(dto.getSalary());
            return repository.save(emp); 
        }
        return null;
    }

    @Override
    public void deleteEmployee(int empId) {
        repository.deleteById(empId); 
    }
}

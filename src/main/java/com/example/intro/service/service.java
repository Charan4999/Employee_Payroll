package com.example.intro.service;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;

import java.util.List;

public interface service {
    List<Model> getAllEmployees();
    Model getEmployeeById(int empId);
    Model createEmployee(dto dto);
    Model updateEmployee(int empId, dto dto);
    void deleteEmployee(int empId);
}
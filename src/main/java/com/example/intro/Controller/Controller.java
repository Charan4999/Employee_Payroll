package com.example.intro.Controller;

import com.example.intro.dto.dto;
import com.example.intro.Model.Model;
import com.example.intro.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class Controller {

    @Autowired
    private service service;

    @GetMapping
    public List<Model> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Model getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Model createEmployee(@RequestBody dto dto) {
        return service.createEmployee(dto);
    }

    @PutMapping("/{id}")
    public Model updateEmployee(@PathVariable int id, @RequestBody dto dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted employee with ID: " + id;
    }
}
package com.example.intro.repository;

import com.example.intro.Model.Model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Model, Integer> {

	List<Model> findAll();
    
}

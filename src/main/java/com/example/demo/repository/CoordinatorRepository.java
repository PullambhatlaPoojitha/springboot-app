package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Coordinators;

public interface CoordinatorRepository extends JpaRepository<Coordinators, String> {
    Coordinators findByLoginId(String loginId);
}

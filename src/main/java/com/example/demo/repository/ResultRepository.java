package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ResultEntity;

public interface ResultRepository extends JpaRepository<ResultEntity, String> {

	ResultEntity findByDepartmentId(String departmentId);

}

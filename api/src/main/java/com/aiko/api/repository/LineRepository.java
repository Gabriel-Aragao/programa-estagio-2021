package com.aiko.api.repository;

import com.aiko.api.model.Line;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<Line, Long>{
  
}

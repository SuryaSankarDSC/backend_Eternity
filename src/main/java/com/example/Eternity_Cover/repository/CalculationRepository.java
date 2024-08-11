package com.example.Eternity_Cover.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Eternity_Cover.model.Calculation;

public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}


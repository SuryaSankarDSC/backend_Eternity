package com.example.Eternity_Cover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Eternity_Cover.model.Calculation;
import com.example.Eternity_Cover.repository.CalculationRepository;

import java.util.List;

@Service
public class CalculationService {

    @Autowired
    private CalculationRepository calculationRepository;

    public Calculation saveCalculation(Calculation calculation) {
        return calculationRepository.save(calculation);
    }

    public List<Calculation> getAllCalculations() {
        return calculationRepository.findAll();
    }

    public void deleteCalculation(Long id) {
        calculationRepository.deleteById(id);
    }
}


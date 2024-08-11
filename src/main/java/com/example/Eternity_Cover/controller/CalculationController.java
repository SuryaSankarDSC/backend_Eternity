package com.example.Eternity_Cover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Eternity_Cover.model.Calculation;
import com.example.Eternity_Cover.service.CalculationService;

import java.util.List;

@RestController
@RequestMapping("/api/calculations")
@CrossOrigin(origins = "http://localhost:3000") // Adjust the origin as needed
public class CalculationController {

    @Autowired
    private CalculationService calculationService;

    @PostMapping("/calculate")
    public ResponseEntity<Calculation> calculateAndSave(@RequestBody Calculation calculation) {
        Calculation savedCalculation = calculationService.saveCalculation(calculation);
        return new ResponseEntity<>(savedCalculation, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Calculation>> getAllCalculations() {
        List<Calculation> calculations = calculationService.getAllCalculations();
        return new ResponseEntity<>(calculations, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCalculation(@PathVariable Long id) {
        try {
            calculationService.deleteCalculation(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

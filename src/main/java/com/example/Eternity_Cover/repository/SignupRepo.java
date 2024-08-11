package com.example.Eternity_Cover.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Eternity_Cover.model.SignupModel;

public interface SignupRepo extends JpaRepository<SignupModel, Integer> {
    SignupModel findByUsername(String username);
}

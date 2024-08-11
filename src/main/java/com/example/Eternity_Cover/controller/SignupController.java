package com.example.Eternity_Cover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Eternity_Cover.model.SignupModel;
import com.example.Eternity_Cover.repository.SignupRepo;
import com.example.Eternity_Cover.service.SignupService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SignupController {
    @Autowired
    SignupService sus;

    @Autowired
    SignupRepo sur;

    @PostMapping("/reg")
    public ResponseEntity<SignupModel> post(@RequestBody SignupModel data) {
        SignupModel registeredUser = sus.postData(data);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<SignupModel> loginUser(@RequestBody SignupModel loginDetails) {
        SignupModel user = sur.findByUsername(loginDetails.getUsername());
        if (user != null && user.getPassword().equals(loginDetails.getPassword())) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/get")
    public ResponseEntity<List<SignupModel>> getData() {
        List<SignupModel> users = sus.getAllData();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<SignupModel> updateUser(@PathVariable int id, @RequestBody SignupModel updatedData) {
        SignupModel updatedUser = sus.updateData(id, updatedData);
        if (updatedUser != null) {
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        try {
            sus.deleteData(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

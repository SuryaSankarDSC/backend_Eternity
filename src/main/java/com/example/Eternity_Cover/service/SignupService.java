package com.example.Eternity_Cover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Eternity_Cover.model.SignupModel;
import com.example.Eternity_Cover.repository.SignupRepo;

import java.util.List;
import java.util.Optional;

@Service
public class SignupService {
   @Autowired
    SignupRepo sur;

    public SignupModel postData(SignupModel data){
       return sur.save(data);
    }

    public List<SignupModel> getAllData(){
       return sur.findAll();
    }

    public SignupModel updateData(int id, SignupModel updatedData) {
        Optional<SignupModel> existingData = sur.findById(id);
        if (existingData.isPresent()) {
            SignupModel user = existingData.get();
            user.setUsername(updatedData.getUsername());
            user.setEmail(updatedData.getEmail());
            user.setPassword(updatedData.getPassword());
            user.setConfirmpassword(updatedData.getConfirmpassword());
            return sur.save(user);
        }
        return null;
    }

    public void deleteData(int id) {
        sur.deleteById(id);
    }
}

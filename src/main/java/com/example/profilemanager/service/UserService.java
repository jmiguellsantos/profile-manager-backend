package com.example.profilemanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.profilemanager.model.UserApp;
import com.example.profilemanager.repository.UserRepository;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserApp> getAllProfiles() {
        return userRepository.findAll();
    }

    public Optional<UserApp> getProfileById(Long id) {
        return userRepository.findById(id);
    }

    public UserApp saveProfile(UserApp user) {
        return userRepository.save(user);
    }

    public void deleteProfile(Long id) {
        userRepository.deleteById(id);
    }
}

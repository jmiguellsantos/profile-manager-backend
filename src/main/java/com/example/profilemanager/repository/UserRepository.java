package com.example.profilemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.profilemanager.model.UserApp;

@Repository
public interface UserRepository extends JpaRepository<UserApp, Long> {
}

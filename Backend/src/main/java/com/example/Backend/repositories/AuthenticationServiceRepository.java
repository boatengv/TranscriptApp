package com.example.Backend.repositories;

import com.example.Backend.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthenticationServiceRepository extends JpaRepository<Student, String> {
    List<Student> findByEmail(String email);
}

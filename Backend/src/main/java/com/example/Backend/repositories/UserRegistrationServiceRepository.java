package com.example.Backend.repositories;

import com.example.Backend.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRegistrationServiceRepository extends JpaRepository<Student, Integer> {


}

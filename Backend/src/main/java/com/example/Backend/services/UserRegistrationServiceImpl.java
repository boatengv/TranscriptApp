package com.example.Backend.services;

import com.example.Backend.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Backend.repositories.AuthenticationServiceRepository;

@Service
public class UserRegistrationServiceImpl
    implements UserRegistrationService{

    @Autowired
    private final AuthenticationServiceRepository authenticationServiceRepository;

    public UserRegistrationServiceImpl(AuthenticationServiceRepository authenticationServiceRepository){
        this.authenticationServiceRepository = authenticationServiceRepository;
    }

    @Override
    public void registerStudent(Student student) {
        authenticationServiceRepository.save(student);
    }
}

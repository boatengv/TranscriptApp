package com.example.Backend.services;

import com.example.Backend.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Backend.repositories.AuthenticationServiceRepository;

import java.util.List;

@Slf4j
@Service
public class AuthenticationServiceImpl
        implements AuthenticationService {

    @Autowired
    private final AuthenticationServiceRepository authenticationServiceRepository;

    public AuthenticationServiceImpl(AuthenticationServiceRepository authenticationServiceRepository){
        this.authenticationServiceRepository = authenticationServiceRepository;
    }

    @Override
    public int login(String email) {
        List<Student> student = authenticationServiceRepository.findByEmail(email);
        log.info("The student has been = {}",student);
        return student.get(0).getStudentId();
    }


}

package com.example.Backend.controllers;


import com.example.Backend.services.AuthenticationServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class AuthenticationServiceController {

    @Autowired
    private final AuthenticationServiceImpl authenticationServiceImpl;

    public AuthenticationServiceController(AuthenticationServiceImpl authenticationServiceImpl){
        this.authenticationServiceImpl = authenticationServiceImpl;
    }

    @PostMapping("/Login")
    public int login(
            @RequestParam String email,
            @RequestParam String password
    ) {
        return authenticationServiceImpl.login(email, password);
    }
}

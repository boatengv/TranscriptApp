package com.example.Backend.controllers;

import com.example.Backend.services.UserRegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {

    @Autowired
    private final UserRegistrationServiceImpl userRegistrationServiceImpl;

    public UserRegistrationController(UserRegistrationServiceImpl userRegistrationService){
        this.userRegistrationServiceImpl = userRegistrationService;
    }

}

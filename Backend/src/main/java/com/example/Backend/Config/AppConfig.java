package com.example.Backend.Config;

import com.example.Backend.domain.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AppConfig {


    private ObjectMapper objectMapper = new ObjectMapper();
    @Bean
    CommandLineRunner generateStudentIdTest() {

        return args -> {
            Student student = new Student(
                    "Victor",
                    "Boateng",
                    "boatengvictor3@gmail.com",
                    "Victoris12.!"
            );

            Student student2 = new Student(
                    "Simon",
                    "Says",
                    "SimonSays@gmail.com",
                    "SimonSays"
            );

            log.info("Student is {}",objectMapper.writeValueAsString(student));
            log.info("Student2 is {}",objectMapper.writeValueAsString(student2));

        };
    }
}

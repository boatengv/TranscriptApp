package com.example.Backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;

import java.util.UUID;

@Slf4j
@Table(name = "student")
@Entity
@Getter @Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int studentId;
    private String firstName;
    private String surname;
    private String email;
    private String password;

    public Student(String firstname, String surname, String email, String password){
        this.firstName = firstname;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
}

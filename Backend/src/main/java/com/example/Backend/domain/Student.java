package com.example.Backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Table(name = "student")
@Entity
@Getter @Setter
@NoArgsConstructor
public class Student {

    @Id
    private int studentId;
    private String firstName;
    private String surname;
    private String email;
    private String password;

    public Student(int studentId, String firstname, String surname, String email, String password){
        this.studentId = studentId;
        this.firstName = firstname;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
}

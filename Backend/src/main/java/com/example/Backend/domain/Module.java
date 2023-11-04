package com.example.Backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;


@Table
@Entity
@Getter @Setter
@NoArgsConstructor
public class Module {

    @Id
    @GeneratedValue
    private UUID moduleId;
    private String moduleName;
    private int credit;
    private float overall;
    private UUID studentId;

    public Module (UUID moduleId, String moduleName, int credit, float overall, UUID studentId){
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.credit = credit;
        this.overall = overall;
        this.studentId = studentId;
    }
}

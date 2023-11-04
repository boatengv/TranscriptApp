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
public class Content {

    @Id
    @GeneratedValue
    private UUID contentId;
    private String contentName;
    private float weight;
    private String grade;
    private UUID moduleId;

    public Content(UUID contentId, String contentName, float weight, String grade, UUID moduleId){
        this.contentId = contentId;
        this.contentName = contentName;
        this.weight = weight;
        this.grade = grade;
        this.moduleId = moduleId;
    }

}

package com.enviro.assessment.grad001.daniellakalombo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Entity
@Data


public class WasteCategory {

    @Setter
    @Id
    @SequenceGenerator(
            name = "disposal_guideline_sequence",
            sequenceName = "disposal_guideline_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "disposal_guideline_sequence"
    )

    @Column(columnDefinition = "int8")
    private Long id;

    private String name;
    private String description;

    public WasteCategory() {
    }

    public WasteCategory(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public WasteCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + description + '\'' +
                '}';
    }
}

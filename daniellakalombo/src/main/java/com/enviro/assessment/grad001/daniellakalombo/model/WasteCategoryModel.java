package com.enviro.assessment.grad001.daniellakalombo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class WasteCategoryModel {

    @Id
    @SequenceGenerator(
            name = "waste_category_sequence",
            sequenceName = "waste_category_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "waste_category_sequence"
    )

    private Long id;
    private String name;
    private String description;

    public WasteCategoryModel() {
    }

    public WasteCategoryModel(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public WasteCategoryModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "WasteCategoryModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

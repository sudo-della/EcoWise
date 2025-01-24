package com.enviro.assessment.grad001.daniellakalombo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "Waste_categories")
public class WasteCategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    @Size(max = 100, message = "Name must have less than 100 characters")
    private String name;


    @NotBlank(message = "Description cannot be empty")
    @Size(max = 250, message = "Description must have less than 250 characters")
    private String description;

    public WasteCategoryModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters


    public @NotBlank(message = "Name cannot be empty") @Size(max = 100, message = "Name must have less than 100 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name cannot be empty") @Size(max = 100, message = "Name must have less than 100 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Description cannot be empty") @Size(max = 250, message = "Description must have less than 250 characters") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Description cannot be empty") @Size(max = 250, message = "Description must have less than 250 characters") String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

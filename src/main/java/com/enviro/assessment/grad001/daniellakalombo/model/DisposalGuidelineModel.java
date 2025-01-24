package com.enviro.assessment.grad001.daniellakalombo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Disposal_guidelines")
public class DisposalGuidelineModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    @Size(max = 100, message = "Name must have less than 100 characters")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private WasteCategoryModel category;

    @NotBlank(message = "Guidelines cannot be empty")
    @Size(max = 250, message = "Guidelines must have less than 250 characters")
    private String guidelines;

    public DisposalGuidelineModel(String name,WasteCategoryModel category, String guidelines) {
        this.name = name;
        this.category = category;
        this.guidelines = guidelines;
    }


    // Getters and Setters
    public @NotBlank(message = "Name cannot be empty") @Size(max = 100, message = "Name must have less than 100 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name cannot be empty") @Size(max = 100, message = "Name must have less than 100 characters") String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WasteCategoryModel getCategory() {
        return category;
    }

    public void setCategory(WasteCategoryModel category) {
        this.category = category;
    }

    public @NotBlank(message = "Guidelines cannot be empty") @Size(max = 250, message = "Guidelines must have less than 250 characters") String getGuidelines() {
        return guidelines;
    }

    public void setGuidelines(@NotBlank(message = "Guidelines cannot be empty") @Size(max = 250, message = "Guidelines must have less than 250 characters") String guidelines) {
        this.guidelines = guidelines;
    }

    @Override
    public String toString() {
        return "DisposalGuidelineModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", guidelines='" + guidelines + '\'' +
                '}';
    }
}

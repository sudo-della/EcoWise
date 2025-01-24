package com.enviro.assessment.grad001.daniellakalombo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

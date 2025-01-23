package com.enviro.assessment.grad001.daniellakalombo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table


public class DisposalGuideline {

    @Setter
    @Id
    @SequenceGenerator(
            name = "model_sequence",
            sequenceName = "model_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "model_sequence"
    )

    @Column(columnDefinition = "int8")
    private Long id;
    @Setter
    private String category;
    private String guidelines;

    public DisposalGuideline() {
    }

    public DisposalGuideline(Long id, String category, String guidelines) {
        this.id = id;
        this.category = category;
        this.guidelines= guidelines;
    }

    public DisposalGuideline(String category, String guidelines) {
        this.category = category;
        this.guidelines = guidelines;
    }

    public void setGuidelines(String guidelines) {
        this.category = guidelines;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", guidelines='" + guidelines + '\'' +
                '}';
    }
}

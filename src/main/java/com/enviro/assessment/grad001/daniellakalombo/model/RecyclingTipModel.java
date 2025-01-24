package com.enviro.assessment.grad001.daniellakalombo.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data

public class RecyclingTipModel {

    @Setter
    @Getter
    @Id
    @SequenceGenerator(
            name = "recycling_tip_sequence",
            sequenceName = "recycling_tip_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "recycling_tip_sequence"
    )

    @Column(columnDefinition = "int8")
    private Long id;
    private String tip;

    public RecyclingTipModel() {
    }

    public RecyclingTipModel(Long id, String name, String description) {
        this.id = id;
        this.tip = description;
    }

    public RecyclingTipModel(String tip) {
        this.tip = tip;
    }

    public Long getTip() {
        return id;
    }

    public void setTip(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", tip='" + tip + '\'' +
                '}';
    }
}

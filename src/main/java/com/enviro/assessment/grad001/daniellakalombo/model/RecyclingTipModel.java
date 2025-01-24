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
@Table(name = "Recycling_tips")
public class RecyclingTipModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    @Size(max = 100, message = "Name must have less than 100 characters")
    private String name;

    @NotBlank(message = "Tips cannot be empty")
    @Size(max = 250, message = "Tips must have less than 250 characters")
    private String tip;


    public RecyclingTipModel(String name,String tip) {
        this.name = name;
        this.tip = tip;
    }


    @Override
    public String toString() {
        return "RecyclingTipModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }
}

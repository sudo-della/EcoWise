package com.enviro.assessment.grad001.daniellakalombo.configurationrunner;

import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategoryModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.WasteCategoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.List;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WasteCategoryConfig {
    @Bean
    CommandLineRunner commandLineRunner(WasteCategoryRepo repository){
        return args -> {
            WasteCategoryModel wasteCategory1 = new WasteCategoryModel(
                    "waste name",
                    "description"
            );

            WasteCategoryModel wasteCategory2 = new WasteCategoryModel(
                    "waste name",
                    "description"
            );

            repository.saveAll(
                    List.of(wasteCategory1, wasteCategory2)
            );
        };
    }
}

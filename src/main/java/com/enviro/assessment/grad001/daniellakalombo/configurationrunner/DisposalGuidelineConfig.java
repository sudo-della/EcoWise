package com.enviro.assessment.grad001.daniellakalombo.configurationrunner;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuidelineModel;
import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategoryModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.DisposalGuidelineRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class DisposalGuidelineConfig {

    @Bean
    CommandLineRunner commandLineRunner(DisposalGuidelineRepo repository){
        return args -> {
            WasteCategoryModel plasticCategory = new WasteCategoryModel(
                    "Plastic",
                    "Materials made of plastic, such as bottles and containers."
            );

            DisposalGuidelineModel plasticGuideline = new DisposalGuidelineModel(
                    "Plastic Waste Disposal Guideline",
                    plasticCategory,
                    "Separate plastic waste into recyclable and non-recyclable items and dispose of them accordingly."
            );

            WasteCategoryModel glassCategory = new WasteCategoryModel(
                    "Glass",
                    "Materials made of glass, such as bottles, jars, and containers."
            );

            DisposalGuidelineModel glassGuideline = new DisposalGuidelineModel(
                    "Glass Waste Disposal Guideline",
                    glassCategory,
                    "Dispose of glass waste in the designated glass recycling bins."
            );

            repository.saveAll(
                    List.of(plasticGuideline,glassGuideline)
            );
        };
    }
}

package com.enviro.assessment.grad001.daniellakalombo.configurationrunner;

import com.enviro.assessment.grad001.daniellakalombo.model.RecyclingTipModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.RecyclingTipRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.List;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RecyclingTipConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecyclingTipRepo repository){
        return args -> {
            RecyclingTipModel plasticRecyclingTip = new RecyclingTipModel(
                    "Plastic Recycling Tip",
                    "Always rinse plastic containers before recycling."
            );

            RecyclingTipModel glassRecyclingTip = new RecyclingTipModel(
                    "Glass Recycling Tip",
                    "Flatten cardboard boxes to save space in the recycling bin."
            );

            repository.saveAll(
                    List.of(plasticRecyclingTip, glassRecyclingTip)
            );
        };
    }
}

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
            RecyclingTipModel tip1 = new RecyclingTipModel(
                    "tip"
            );

            RecyclingTipModel tip2 = new RecyclingTipModel(
                    "tip 2"
            );

            repository.saveAll(
                    List.of(tip1, tip2)
            );
        };
    }
}

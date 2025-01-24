package com.enviro.assessment.grad001.daniellakalombo.repository;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuidelineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisposalGuidelineRepo extends JpaRepository<DisposalGuidelineModel, Long> {

}

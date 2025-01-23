package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuidelineModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.DisposalGuidelineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposalGuidelineService {

    private final DisposalGuidelineRepo disposalGuidelineRepo;

    @Autowired
    public DisposalGuidelineService(DisposalGuidelineRepo disposalGuidelineRepo){
        this.disposalGuidelineRepo = disposalGuidelineRepo;
    }

    public List<DisposalGuidelineModel> getAllGuidelines() {
        return disposalGuidelineRepo.findAll();
    }

    public DisposalGuidelineModel getGuidelineById(Long id) {
        return disposalGuidelineRepo.findById(id).orElse(null);
    }

    public DisposalGuidelineModel createGuideline(DisposalGuidelineModel guideline) {
        return disposalGuidelineRepo.save(guideline);
    }

    public DisposalGuidelineModel updateGuideline(DisposalGuidelineModel guideline) {
        return disposalGuidelineRepo.save(guideline);
    }

    public void deleteGuideline(Long id) {
        disposalGuidelineRepo.deleteById(id);
    }
}

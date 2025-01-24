package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuidelineModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.DisposalGuidelineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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

    public DisposalGuidelineModel updateGuideline(Long id, DisposalGuidelineModel guideline) {
        return disposalGuidelineRepo.findById(id)
                .map(myGuideline -> {
                    myGuideline.setName(guideline.getName());
                    myGuideline.setCategory(guideline.getCategory());
                    myGuideline.setGuidelines(guideline.getGuidelines());
                    return disposalGuidelineRepo.save(myGuideline);
                })
                .orElseThrow(() -> new NoSuchElementException("DisposalGuideline with ID " + id + " not found"));

    }

    public void deleteGuideline(Long id) {
        disposalGuidelineRepo.deleteById(id);
    }
}

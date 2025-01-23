package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuideline;
import com.enviro.assessment.grad001.daniellakalombo.repository.DisposalGuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposalGuidelineService {

    @Autowired
    private DisposalGuidelineRepository disposalGuidelineRepository;

    public List<DisposalGuideline> getAllGuidelines() {
        return disposalGuidelineRepository.findAll();
    }

    public DisposalGuideline getGuidelineById(Long id) {
        return disposalGuidelineRepository.findById(id).orElse(null);
    }

    public DisposalGuideline createGuideline(DisposalGuideline guideline) {
        return disposalGuidelineRepository.save(guideline);
    }

    public DisposalGuideline updateGuideline(DisposalGuideline guideline) {
        return disposalGuidelineRepository.save(guideline);
    }

    public void deleteGuideline(Long id) {
        disposalGuidelineRepository.deleteById(id);
    }
}

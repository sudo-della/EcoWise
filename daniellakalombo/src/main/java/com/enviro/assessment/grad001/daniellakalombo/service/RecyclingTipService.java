package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.RecyclingTipModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.DisposalGuidelineRepo;
import com.enviro.assessment.grad001.daniellakalombo.repository.RecyclingTipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecyclingTipService {

    private final RecyclingTipRepo recyclingTipRepo;

    @Autowired
    public RecyclingTipService(RecyclingTipRepo recyclingTipRepo){
        this.recyclingTipRepo = recyclingTipRepo;
    }

    public List<RecyclingTipModel> getAllTips() {
        return recyclingTipRepo.findAll();
    }

    public RecyclingTipModel getTipById(Long id) {
        return recyclingTipRepo.findById(id).orElse(null);
    }

    public RecyclingTipModel createTip(RecyclingTipModel tip) {
        return recyclingTipRepo.save(tip);
    }

    public RecyclingTipModel updateTip(RecyclingTipModel tip) {
        return recyclingTipRepo.save(tip);
    }

    public void deleteTip(Long id) {
        recyclingTipRepo.deleteById(id);
    }
}

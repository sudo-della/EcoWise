package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.RecyclingTipModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.RecyclingTipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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

    public RecyclingTipModel updateTip(Long id, RecyclingTipModel tip) {
        return recyclingTipRepo.findById(id)
                .map(myTip -> {
                    myTip.setName(tip.getName());
                    myTip.setTip(tip.getTip());
                    return recyclingTipRepo.save(myTip);
                })
                .orElseThrow(() -> new NoSuchElementException("Recycling Tip with id " + id + " not found"));
    }

    public void deleteTip(Long id) {
        recyclingTipRepo.deleteById(id);
    }
}

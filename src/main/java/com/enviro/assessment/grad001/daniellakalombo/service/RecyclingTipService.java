package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.RecyclingTip;
import com.enviro.assessment.grad001.daniellakalombo.repository.RecyclingTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecyclingTipService {

    @Autowired
    private RecyclingTipRepository recyclingTipRepository;

    public List<RecyclingTip> getAllTips() {
        return recyclingTipRepository.findAll();
    }

    public RecyclingTip getTipById(Long id) {
        return recyclingTipRepository.findById(id).orElse(null);
    }

    public RecyclingTip createTip(RecyclingTip tip) {
        return recyclingTipRepository.save(tip);
    }

    public RecyclingTip updateTip(RecyclingTip tip) {
        return recyclingTipRepository.save(tip);
    }

    public void deleteTip(Long id) {
        recyclingTipRepository.deleteById(id);
    }
}

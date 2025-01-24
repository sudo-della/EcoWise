package com.enviro.assessment.grad001.daniellakalombo.controller;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuidelineModel;
import com.enviro.assessment.grad001.daniellakalombo.model.RecyclingTipModel;
import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategoryModel;
import com.enviro.assessment.grad001.daniellakalombo.service.RecyclingTipService;
import com.enviro.assessment.grad001.daniellakalombo.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tips")
public class RecyclingTipController {

    @Autowired
    private RecyclingTipService recyclingTipService;

    @GetMapping
    public List<RecyclingTipModel> getAllTips() {
        return recyclingTipService.getAllTips();
    }

    @GetMapping("/{id}")
    public RecyclingTipModel getTipById(@PathVariable Long id) {
        return recyclingTipService.getTipById(id);
    }

    @PostMapping
    public RecyclingTipModel createTip(@RequestBody RecyclingTipModel tip) {
        return recyclingTipService.createTip(tip);
    }

    @PutMapping("/{id}")
    public RecyclingTipModel updateTip(@PathVariable Long id, @RequestBody RecyclingTipModel tip) {
        return recyclingTipService.updateTip(id, tip);
    }

    @DeleteMapping("/{id}")
    public void deleteTip(@PathVariable Long id) {
        recyclingTipService.deleteTip(id);
    }

}

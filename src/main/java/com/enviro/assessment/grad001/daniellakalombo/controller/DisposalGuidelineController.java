package com.enviro.assessment.grad001.daniellakalombo.controller;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuidelineModel;
import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategoryModel;
import com.enviro.assessment.grad001.daniellakalombo.service.DisposalGuidelineService;
import com.enviro.assessment.grad001.daniellakalombo.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guideline")
public class DisposalGuidelineController {

    @Autowired
    private DisposalGuidelineService disposalGuidelineService;

    @GetMapping
    public List<DisposalGuidelineModel> getAllGuidelines() {
        return disposalGuidelineService.getAllGuidelines();
    }

    @GetMapping("/{id}")
    public DisposalGuidelineModel getGuidelineById(@PathVariable Long id) {
        return disposalGuidelineService.getGuidelineById(id);
    }

    @PostMapping
    public DisposalGuidelineModel createGuideline(@RequestBody DisposalGuidelineModel guidelines) {
        return disposalGuidelineService.createGuideline(guidelines);
    }

    @PutMapping("/{id}")
    public DisposalGuidelineModel updateGuideline(@PathVariable Long id, @RequestBody DisposalGuidelineModel guidelines) {
        return disposalGuidelineService.updateGuideline(id, guidelines);
    }

    @DeleteMapping("/{id}")
    public void deleteGuideline(@PathVariable Long id) {
        disposalGuidelineService.deleteGuideline(id);
    }
}

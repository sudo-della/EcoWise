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
    public ResponseEntity<List<DisposalGuidelineModel>> getAllCategories() {
        return ResponseEntity.ok(disposalGuidelineService.getAllGuidelines());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuidelineModel> getCategoryById(@PathVariable Long id) {
        DisposalGuidelineModel category = disposalGuidelineService.getGuidelineById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<DisposalGuidelineModel> createCategory(@RequestBody DisposalGuidelineModel category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(disposalGuidelineService.createGuideline(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuidelineModel> updateCategory(@PathVariable Long id, @RequestBody DisposalGuidelineModel category) {
        category.setId(id); // Set the ID explicitly
        DisposalGuidelineModel updatedCategory = disposalGuidelineService.updateGuideline(category);
        return ResponseEntity.ok(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuideline(@PathVariable Long id) {
        disposalGuidelineService.deleteGuideline(id);
        return ResponseEntity.noContent().build();
    }
}

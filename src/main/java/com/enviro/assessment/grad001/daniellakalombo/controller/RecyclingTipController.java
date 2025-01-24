package com.enviro.assessment.grad001.daniellakalombo.controller;

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
    public ResponseEntity<List<RecyclingTipModel>> getAllCategories() {
        return ResponseEntity.ok(recyclingTipService.getAllTips());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTipModel> getCategoryById(@PathVariable Long id) {
        RecyclingTipModel category = recyclingTipService.getTipById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<RecyclingTipModel> createCategory(@RequestBody RecyclingTipModel category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(recyclingTipService.createTip(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecyclingTipModel> updateCategory(@PathVariable Long id, @RequestBody RecyclingTipModel category) {
        category.setId(id); // Set the ID explicitly
        RecyclingTipModel updatedCategory = recyclingTipService.updateTip(category);
        return ResponseEntity.ok(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTip(@PathVariable Long id) {
        recyclingTipService.deleteTip(id);
        return ResponseEntity.noContent().build();
    }

}

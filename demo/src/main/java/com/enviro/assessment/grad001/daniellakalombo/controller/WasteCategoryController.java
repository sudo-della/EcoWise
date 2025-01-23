package com.enviro.assessment.grad001.daniellakalombo.controller;

import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategory;
import com.enviro.assessment.grad001.daniellakalombo.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class WasteCategoryController {

    @Autowired
    private WasteCategoryService wasteCategoryService;

    @GetMapping
    public ResponseEntity<List<WasteCategory>> getAllCategories() {
        return ResponseEntity.ok(wasteCategoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getCategoryById(@PathVariable Long id) {
        WasteCategory category = wasteCategoryService.getCategoryById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<WasteCategory> createCategory(@RequestBody WasteCategory category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(wasteCategoryService.createCategory(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WasteCategory> updateCategory(@PathVariable Long id, @RequestBody WasteCategory category) {
        category.setId(id); // Set the ID explicitly
        WasteCategory updatedCategory = wasteCategoryService.updateCategory(category);
        return ResponseEntity.ok(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }

}

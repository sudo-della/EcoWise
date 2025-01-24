package com.enviro.assessment.grad001.daniellakalombo.controller;

import com.enviro.assessment.grad001.daniellakalombo.model.RecyclingTipModel;
import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategoryModel;
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
    public List<WasteCategoryModel> getAllCategories() {
        return wasteCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public WasteCategoryModel getCategoryById(@PathVariable Long id) {
        return wasteCategoryService.getCategoryById(id);
    }

    @PostMapping
    public WasteCategoryModel createCategory(@RequestBody WasteCategoryModel category) {
        return wasteCategoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public WasteCategoryModel updateCategory(@PathVariable Long id, @RequestBody WasteCategoryModel category) {
        return wasteCategoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteCategory(id);
    }

}

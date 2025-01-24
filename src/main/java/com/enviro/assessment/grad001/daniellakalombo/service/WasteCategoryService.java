package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategoryModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.RecyclingTipRepo;
import com.enviro.assessment.grad001.daniellakalombo.repository.WasteCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCategoryService {

    private final WasteCategoryRepo wasteCategoryRepo;

    @Autowired
    public WasteCategoryService(WasteCategoryRepo wasteCategoryRepo){
        this.wasteCategoryRepo = wasteCategoryRepo;
    }

    public List<WasteCategoryModel> getAllCategories() {
        return wasteCategoryRepo.findAll();
    }

    public WasteCategoryModel getCategoryById(Long id) {
        return wasteCategoryRepo.findById(id).orElse(null);
    }

    public WasteCategoryModel createCategory(WasteCategoryModel category) {
        return wasteCategoryRepo.save(category);
    }

    public WasteCategoryModel updateCategory(WasteCategoryModel category) {
        return wasteCategoryRepo.save(category);
    }

    public void deleteCategory(Long id) {
        wasteCategoryRepo.deleteById(id);
    }
}

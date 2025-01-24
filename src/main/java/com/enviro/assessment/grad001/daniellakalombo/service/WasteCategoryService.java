package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.RecyclingTipModel;
import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategoryModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.RecyclingTipRepo;
import com.enviro.assessment.grad001.daniellakalombo.repository.WasteCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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

    public WasteCategoryModel updateCategory(Long id, WasteCategoryModel category) {
        return wasteCategoryRepo.findById(id)
                .map(myCategory -> {
                    myCategory.setName(category.getName());
                    myCategory.setDescription(category.getDescription());
                    return wasteCategoryRepo.save(myCategory);
                })
                .orElseThrow(() -> new NoSuchElementException("Waste Category with ID " + id + " not found"));
    }



    public void deleteCategory(Long id) {
        wasteCategoryRepo.deleteById(id);
    }
}

package com.enviro.assessment.grad001.daniellakalombo.service;

import com.enviro.assessment.grad001.daniellakalombo.model.WasteCategory;
import com.enviro.assessment.grad001.daniellakalombo.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCategoryService {

    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    public List<WasteCategory> getAllCategories() {
        return wasteCategoryRepository.findAll();
    }

    public WasteCategory getCategoryById(Long id) {
        return wasteCategoryRepository.findById(id).orElse(null);
    }

    public WasteCategory createCategory(WasteCategory category) {
        return wasteCategoryRepository.save(category);
    }

    public WasteCategory updateCategory(WasteCategory category) {
        return wasteCategoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        wasteCategoryRepository.deleteById(id);
    }
}

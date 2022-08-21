package com.frknzdmr.store.service;

import com.frknzdmr.store.model.Category;

import java.util.List;

public interface CategoryService {

    Category saveCategory(Category category);
    List<Category> getCategories();
    Category getCategoryById(int id);
    void deleteCategoryById(int id);

}

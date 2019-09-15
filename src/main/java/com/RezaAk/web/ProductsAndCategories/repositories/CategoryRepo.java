package com.RezaAk.web.ProductsAndCategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.RezaAk.web.ProductsAndCategories.models.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
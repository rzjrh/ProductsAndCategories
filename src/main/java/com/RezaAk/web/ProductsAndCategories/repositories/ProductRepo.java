package com.RezaAk.web.ProductsAndCategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.RezaAk.web.ProductsAndCategories.models.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
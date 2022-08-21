package com.frknzdmr.store.service;

import com.frknzdmr.store.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);
    List<Product> getProducts();
    Product getProductById(int id);

}

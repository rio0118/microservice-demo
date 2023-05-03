package com.demo.rio.productservice.repository;

import com.demo.rio.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

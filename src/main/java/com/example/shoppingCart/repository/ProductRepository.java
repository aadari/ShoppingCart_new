package com.example.shoppingCart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.shoppingCart.entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Long>
{
   
}

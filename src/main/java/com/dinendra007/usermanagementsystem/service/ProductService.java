package com.dinendra007.usermanagementsystem.service;

import com.dinendra007.usermanagementsystem.entity.Product;
import com.dinendra007.usermanagementsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
   @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){

        return repository.save(product);
    }

    public List<Product>getProduct(){

        return repository.findAll();
    }

    public Optional<Product> getProductByID(int id){

        return repository.findById(id);
    }
}

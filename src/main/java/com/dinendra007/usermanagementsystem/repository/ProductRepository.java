package com.dinendra007.usermanagementsystem.repository;

import com.dinendra007.usermanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}

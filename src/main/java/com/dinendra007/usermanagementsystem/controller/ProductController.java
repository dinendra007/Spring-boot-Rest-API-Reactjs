package com.dinendra007.usermanagementsystem.controller;

import com.dinendra007.usermanagementsystem.entity.Product;
import com.dinendra007.usermanagementsystem.service.ProductService;
import com.example.NoUserFoundException;
import com.example.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("product/")
public class ProductController {
    @Autowired
    private ProductService service;
    
    @PostMapping("add")
    public Product addProduct(@RequestBody Product product){

        return service.saveProduct(product);
    }
    @GetMapping("all")
    public List<Product> getProduct(){
        List<Product> product = service.getProduct();
        return product;
    }

    @GetMapping("getid/{id}")
    public Optional<Product> getProductByID(@PathVariable int id){

        return service.getProductByID(id);
    }
    
    @PutMapping(value="/update/{id}")
	public Product updateData(@PathVariable("id") int id, @RequestBody final Product product)
	{
			Product new_product = service.findById(id).get();
			new_product.setName(product.getName());
			new_product.setAge(product.getAge());
			new_product.setCity(product.getCity());
			return service.save(new_product);
	}
    
    @DeleteMapping(value="/delete/{id}")
	public String deleteData(@PathVariable("id") int id) 
	{
		 service.deleteById(id);
		 return ("deleted");
	 }
    
    
    
}

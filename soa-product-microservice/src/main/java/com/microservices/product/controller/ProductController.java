package com.microservices.product.controller;


import com.microservices.product.model.Product;
import com.microservices.product.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product/")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;


    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/find/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }




}
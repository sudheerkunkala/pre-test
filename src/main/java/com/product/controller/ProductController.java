package com.product.controller;

import com.product.entity.Product;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/sortProducts")
    public List<Product> sortProducts(@RequestBody List<Product> products){
        return productService.sort(products);
    }



}

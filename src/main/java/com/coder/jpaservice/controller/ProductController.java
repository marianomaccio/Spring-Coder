package com.coder.jpaservice.controller;

import com.coder.jpaservice.dto.ProductDto;
import com.coder.jpaservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<ProductDto> findProductById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(productService.findProductById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/product/{id}")
    public ResponseEntity<ProductDto> updateProductById(@PathVariable(name = "id") long id, ProductDto productDto){
        return new ResponseEntity<>(productService.updateProductById(id, productDto), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/product")
    public ResponseEntity<ProductDto> insertProductById(@RequestBody ProductDto productDto){
            return new ResponseEntity<>(productService.insertProductById(productDto), HttpStatus.ACCEPTED);
    }

}

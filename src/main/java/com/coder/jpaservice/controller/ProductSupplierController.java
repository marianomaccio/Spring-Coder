package com.coder.jpaservice.controller;

import com.coder.jpaservice.dto.ProductSupplierDto;
import com.coder.jpaservice.service.ProductSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class ProductSupplierController {
    @Autowired
    ProductSupplierService productSupplierService;

    @GetMapping(value = "/productSupplier/{id}")
    public ResponseEntity<ProductSupplierDto> findProductSupplierById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(productSupplierService.findProductSupplierById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/productSupplier/{id}")
    public ResponseEntity<ProductSupplierDto> updateProductSupplierById(@PathVariable(name = "id") long id, @RequestBody ProductSupplierDto productSupplierDto){
        return new ResponseEntity<>(productSupplierService.updateProductSupplierById(id, productSupplierDto), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/productSupplier")
    public ResponseEntity<ProductSupplierDto> insertProductSupplier(@RequestBody ProductSupplierDto productSupplierDto){
        return new ResponseEntity<>(productSupplierService.insertProductSupplier(productSupplierDto), HttpStatus.ACCEPTED);
    }
}

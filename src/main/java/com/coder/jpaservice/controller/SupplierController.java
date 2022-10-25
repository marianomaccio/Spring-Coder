package com.coder.jpaservice.controller;

import com.coder.jpaservice.dto.SupplierDto;
import com.coder.jpaservice.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping(value = "/Supplier/{id}")
    public ResponseEntity<SupplierDto> findSupplierById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(supplierService.findSupplierById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/Supplier/{id}")
    public ResponseEntity<SupplierDto> updateSupplierById(@PathVariable(name = "id") long id, @RequestBody SupplierDto supplierDto){
        return new ResponseEntity<>(supplierService.updateSupplierById(id, supplierDto), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/Supplier")
    public ResponseEntity<SupplierDto> insertSupplierById(@RequestBody SupplierDto supplierDto){
        return new ResponseEntity<>(supplierService.insertSupplierById(supplierDto), HttpStatus.ACCEPTED);
    }
}

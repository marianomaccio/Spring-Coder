package com.coder.jpaservice.controller;

import com.coder.jpaservice.dto.BillDto;
import com.coder.jpaservice.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class BillController {
    @Autowired
    BillService billService;

    @GetMapping(value = "/bill/{id}")
    public ResponseEntity<BillDto> findBillById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(this.billService.findBillById(id),HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/bill/{id}")
    public ResponseEntity<BillDto> updateBillById(@PathVariable(name = "id") long id, @RequestBody BillDto billDto){
        return new ResponseEntity<>(this.billService.updateBillById(id, billDto), HttpStatus.ACCEPTED);

    }

    @PostMapping(value = "/bill")
    public ResponseEntity<BillDto> insertBill(@RequestBody BillDto billDto){
        return new ResponseEntity<>(billService.insertBill(billDto), HttpStatus.ACCEPTED);
    }


}

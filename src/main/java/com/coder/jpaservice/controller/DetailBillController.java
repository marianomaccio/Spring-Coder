package com.coder.jpaservice.controller;

import com.coder.jpaservice.dto.DetailBillDto;
import com.coder.jpaservice.service.DetailBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class DetailBillController {
    @Autowired
    DetailBillService detailBillService;

    @GetMapping(value = "/detailBill/{id}")
    public ResponseEntity<DetailBillDto> findDetailBillById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(detailBillService.findDetailBillById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/detailBill/{id}")
    public ResponseEntity<DetailBillDto> updateDetailBillById(@PathVariable(name = "id") long id, @RequestBody DetailBillDto detailBillDto){
        return new ResponseEntity<>(detailBillService.updateDetailBillById(id, detailBillDto), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/detailBill")
    public ResponseEntity<DetailBillDto> insertDetailBill(@RequestBody DetailBillDto detailBillDto){
        return  new ResponseEntity<>(detailBillService.insertDetailBill(detailBillDto), HttpStatus.ACCEPTED);
    }
}

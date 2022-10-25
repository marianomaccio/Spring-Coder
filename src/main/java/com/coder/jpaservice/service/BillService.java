package com.coder.jpaservice.service;

import com.coder.jpaservice.dto.BillDto;
import com.coder.jpaservice.model.BillModel;
import com.coder.jpaservice.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Autowired
    BillRepository billRepository;
    public BillDto findBillById(long id) {
        BillModel billModel = billRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid bill"));
        BillDto billDto = BillDto.from(billModel);
        return billDto;
    }

    public BillDto updateBillById(long id, BillDto billDto) {
        BillModel billModel = billRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid bill"));
        billModel.setDate(billDto.getDate());
        billModel.setTotal(billDto.getTotal());
        billModel.setClientId(billDto.getClientId());
        billModel= billRepository.save(billModel);
        BillDto bill = BillDto.from(billModel);
        return bill;
    }

    public BillDto insertBill(BillDto billDto) {
        BillModel billModel = new BillModel();
        billModel.setDate(billDto.getDate());
        billModel.setTotal(billDto.getTotal());
        billModel.setClientId(billDto.getClientId());
        BillDto bill = BillDto.from(billModel);
        billRepository.save(billModel);
        return bill;
    }
}

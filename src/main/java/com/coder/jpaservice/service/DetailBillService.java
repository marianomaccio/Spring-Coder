package com.coder.jpaservice.service;

import com.coder.jpaservice.dto.DetailBillDto;
import com.coder.jpaservice.model.DetailBillModel;
import com.coder.jpaservice.repository.DetailBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailBillService {
    @Autowired
    DetailBillRepository detailBillRepository;

    public DetailBillDto findDetailBillById(long id){
        DetailBillModel detailBillModel = detailBillRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid detail bill"));
        DetailBillDto detailBillDto = DetailBillDto.from(detailBillModel);
        return detailBillDto;
    }

    public DetailBillDto updateDetailBillById(long id, DetailBillDto detailBillDto) {
        DetailBillModel detailBillModel = detailBillRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid detail bill"));
        detailBillModel.setStock(detailBillDto.getStock());
        detailBillModel.setBillModel(detailBillDto.getBillModel());
        detailBillModel.setProductModel(detailBillDto.getProductModel());
        detailBillModel = detailBillRepository.save(detailBillModel);
        DetailBillDto detailBill = DetailBillDto.from(detailBillModel);
        return detailBill;
    }

    public DetailBillDto insertDetailBill(DetailBillDto detailBillDto) {
        DetailBillModel detailBillModel = new DetailBillModel();
        detailBillModel.setStock(detailBillDto.getStock());
        detailBillModel.setBillModel(detailBillDto.getBillModel());
        detailBillModel.setBillModel(detailBillDto.getBillModel());
        detailBillModel = detailBillRepository.save(detailBillModel);
        DetailBillDto detailBill = DetailBillDto.from(detailBillModel);
        return detailBill;
    }
}

package com.coder.jpaservice.dto;

import com.coder.jpaservice.model.BillModel;
import com.coder.jpaservice.model.DetailBillModel;
import com.coder.jpaservice.model.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DetailBillDto {
    private int stock;

    private BillModel billModel;

    private ProductModel productModel;

    public static DetailBillDto from(DetailBillModel detailBill){
        return new DetailBillDto(detailBill.getStock(), detailBill.getBillModel(), detailBill.getProductModel());
    }
}

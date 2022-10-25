package com.coder.jpaservice.dto;

import com.coder.jpaservice.model.BillModel;
import com.coder.jpaservice.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@AllArgsConstructor
public class BillDto {

    private LocalDate date;

    private BigDecimal total;

    private ClientModel clientId;

    public static BillDto from(BillModel billModel){
        return new BillDto(billModel.getDate(), billModel.getTotal(), billModel.getClientId());
    }
}

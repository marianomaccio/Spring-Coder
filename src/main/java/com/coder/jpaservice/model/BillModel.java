package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "coder_bills")
public class BillModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bills")
    private long id;

    @Column
    private LocalDate date;

    @Column
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientModel clientId;

    @OneToMany(mappedBy = "billModel", cascade = CascadeType.ALL)
    private List<DetailBillModel> detailBillModelList;


}

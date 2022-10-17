package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "coder_detail_bill")
public class DetailBillModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_bill")
    private long id;

    @Column
    private int stock;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private BillModel billModel;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductModel productModel;
}

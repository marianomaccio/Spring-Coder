package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "coder_products")
public class ProductModel {
    @Id
    @GeneratedValue
    @Column(name = "id_product")
    private long id;

    @Column(name = "name_product")
    private String name;

    @Column
    private BigDecimal price;

    @Column
    private int stock;

    @Column
    private String article;

    @Column
    private char state;

    @ManyToOne
    @JoinColumn(name = "id_purchase")
    private PurchaseModel purchase;



}

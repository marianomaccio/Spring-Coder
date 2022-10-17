package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name = "coder_products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long id;

    @Column(name = "name_product")
    private String name;

    @Column(name = "purchase_price")
    private BigDecimal purchasePrice;

    @Column(name = "sale_price")
    private BigDecimal salePrice;

    @Column
    private int stock;

    @Column
    private String description;

    @Column
    private char state;

    @ManyToOne
    @JoinColumn(name = "product_supplier_id")
    private ProductSupplierModel productSupplierId;

    @ManyToOne
    @JoinColumn(name = "heading_id")
    private HeadingModel headingModel;

    @OneToMany(mappedBy = "productModel", cascade = CascadeType.ALL)
    private List<DetailBillModel> detailBillModelList;


/*
    @ManyToOne
    @JoinColumn(name = "id_purchase")
    private PurchaseModel purchase;
*/


}

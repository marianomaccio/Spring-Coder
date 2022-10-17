package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@Table(name = "coder_products_suppliers")
public class ProductSupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_products_suppliers")
    private long id;

    @Column(name = "id_product")
    private long idProduct;

    @Column(name = "id_suppliers")
    private long idSupplier;

    @OneToMany(mappedBy = "productSupplierId", cascade = CascadeType.ALL)
    private List<ProductModel> productModel;

    @OneToMany(mappedBy = "productSupplierId", cascade = CascadeType.ALL)
    private List<SupplierModel> supplierModel;
}

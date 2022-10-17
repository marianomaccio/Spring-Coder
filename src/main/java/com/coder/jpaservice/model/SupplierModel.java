package com.coder.jpaservice.model;

import lombok.Data;
import org.hibernate.tuple.GeneratedValueGeneration;

import javax.persistence.*;
@Entity
@Data
@Table(name = "coder_suppliers")
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_supplier")
    private long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "product_supplier_id")
    private ProductSupplierModel productSupplierId;

}

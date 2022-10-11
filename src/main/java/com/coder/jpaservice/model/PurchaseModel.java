package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Data
@Table(name = "coder_purchases")
public class PurchaseModel {
    @Id
    @GeneratedValue
    @Column(name = "id_purchase")
    private long id;

    @Column
    private BigDecimal price;

    @Column(name = "date_purchase")
    private Date datePurchase;


    @ManyToOne
    @JoinColumn(name = "id_client")
    private ClientModel client;

    @OneToMany(mappedBy ="purchase", cascade = CascadeType.ALL)
    private List<ProductModel> productModel;




}

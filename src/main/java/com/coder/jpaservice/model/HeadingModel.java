package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@Table(name = "coder_heading")
public class HeadingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_heading")
    private long id;

    @Column
    private String description;

    @OneToMany(mappedBy = "headingModel", cascade = CascadeType.ALL)
    private List<ProductModel> productModel;
}

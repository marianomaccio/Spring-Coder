package com.coder.jpaservice.model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@Table(name = "coder_clients")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private long id;

    @Column(name = "name_client")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_document")
    private String identityDocument;

    @Column
    private String address;

    @Column(name = "date_birth")
    private LocalDate birth;

    @Column
    private char state;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<PurchaseModel> listPurchase;

}

package com.coder.jpaservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "coder_user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column
    private String password;

}

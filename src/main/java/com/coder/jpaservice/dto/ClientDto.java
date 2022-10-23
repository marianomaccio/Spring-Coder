package com.coder.jpaservice.dto;

import com.coder.jpaservice.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;


@Data
@AllArgsConstructor
public class ClientDto {

    private String name;

    private String lastName;

    private String identityDocument;

    private String address;

    private LocalDate birth;

    private char state;

    public static ClientDto from (ClientModel client) {
        return new ClientDto(client.getName(), client.getLastName(), client.getIdentityDocument(), client.getAddress(), client.getBirth(), client.getState());
    }
}

package com.coder.jpaservice.service;

import com.coder.jpaservice.dto.ClientDto;
import com.coder.jpaservice.model.ClientModel;
import com.coder.jpaservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ClientDto findClientById(long id) {
        ClientModel clientModel = clientRepository.findById(id).orElseThrow(()-> new RuntimeException("Invalid user"));
        ClientDto client= ClientDto.from(clientModel);
        return client;
    }


    public ClientDto updateClientById(long id, ClientDto clientUpdate) {
        ClientModel client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid user"));
        client.setName(clientUpdate.getName());
        client.setLastName(clientUpdate.getLastName());
        client.setIdentityDocument(clientUpdate.getIdentityDocument());
        client.setAddress(clientUpdate.getAddress());
        client.setBirth(clientUpdate.getBirth());
        client.setState(clientUpdate.getState());
        client = clientRepository.save(client);
        ClientDto clientDto= ClientDto.from(client);
        return clientDto;
    }

    public ClientDto insertClient(ClientDto newClient) {
        ClientModel insertClient = new ClientModel();
        insertClient.setName(newClient.getName());
        insertClient.setLastName(newClient.getLastName());
        insertClient.setIdentityDocument(newClient.getIdentityDocument());
        insertClient.setAddress(newClient.getAddress());
        insertClient.setBirth(newClient.getBirth());
        insertClient.setState(newClient.getState());
        insertClient= clientRepository.save(insertClient);
        ClientDto dto = ClientDto.from(insertClient);
        return dto;
    }
}

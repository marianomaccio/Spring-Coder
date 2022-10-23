package com.coder.jpaservice.controller;

import com.coder.jpaservice.dto.ClientDto;
import com.coder.jpaservice.model.ClientModel;
import com.coder.jpaservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sale")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping(value = "/client/{id}")
    public ResponseEntity<ClientDto> findClientById(@PathVariable(name = "id") long id) throws Exception {
        return new ResponseEntity<>(this.clientService.findClientById(id), HttpStatus.ACCEPTED);
    }


    @PutMapping(value = "/client/{id}")
    public ResponseEntity<ClientDto> updateClientById(@PathVariable(name = "id") long id, @RequestBody ClientDto clientUpdate) {
        return new ResponseEntity<>(clientService.updateClientById(id, clientUpdate), HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/client")
    public ResponseEntity<ClientDto> insertClient(@RequestBody ClientDto newClient){
        return new ResponseEntity<>(clientService.insertClient(newClient), HttpStatus.ACCEPTED);
    }

}
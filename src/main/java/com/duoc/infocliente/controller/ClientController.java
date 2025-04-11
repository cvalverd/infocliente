package com.duoc.infocliente.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.duoc.infocliente.service.ClientService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.duoc.infocliente.model.Client;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    
    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        if (clients.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getUserById(@PathVariable String id) {
        Client client = clientService.getClientById(id);
        if (client == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(client);
    }


    @PostMapping
    public ResponseEntity<Void> createClientEntity(@RequestBody Client client) {
        clientService.createClient(client);
        
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable String id, @RequestBody Client client) {
        if (!id.equals(client.getId()) || clientService.getClientById(id).equals(client) || 
            clientService.getClientById(id) == null ){
            return ResponseEntity.badRequest().build();
        }
        clientService.updateClient(id, client);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable String id) {
        if(clientService.getClientById(id) == null) {
            return ResponseEntity.badRequest().build(); 
        }
        clientService.deleteClient(id);
        return ResponseEntity.ok().build();
    }

}

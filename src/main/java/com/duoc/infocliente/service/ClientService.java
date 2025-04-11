package com.duoc.infocliente.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duoc.infocliente.model.Client;

@Service
public interface ClientService {
    List<Client> getAllClients();
    void createClient(Client client);
    Client getClientById(String id);
    void updateClient(String id, Client client);
    void deleteClient(String id);
}

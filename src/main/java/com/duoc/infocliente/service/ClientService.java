package com.duoc.infocliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.duoc.infocliente.model.Client;

@Service
public interface ClientService {
    List<Client> getAllClients();
    Client saveClient(Client client);
    Optional<Client> getClientById(Long id);
    Client updateClient(Long id, Client client);
    void deleteClientById(Long id);
}

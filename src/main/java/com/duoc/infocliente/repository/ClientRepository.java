package com.duoc.infocliente.repository;

import java.util.ArrayList;
import java.util.List;

import com.duoc.infocliente.model.Client;

public class ClientRepository {
    
    private final List<Client> clients = new ArrayList<>();

    public List<Client> findAll() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public ClientRepository() {

        clients.add(new Client(1,"nsilva","nicolas","nsilva@duocuc.cl"));
        clients.add(new Client(2,"lolivares","leonardo","lolivares@duocuc.cl"));
        clients.add(new Client(3,"javier","javier","javier@duocuc.cl"));

    }

}

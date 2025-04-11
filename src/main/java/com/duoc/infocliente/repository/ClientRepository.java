package com.duoc.infocliente.repository;

import java.util.ArrayList;
import java.util.List;

import com.duoc.infocliente.model.Client;
import com.duoc.infocliente.model.ProfileInfo;

public class ClientRepository {
    
    private final List<Client> clients = new ArrayList<>();

    public List<Client> findAll() {
        return clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client findClientById(String id) {
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    public void updateClient(String id,Client updateClient) {
        for (int i = 0; i < clients.size();i++) {
            if (clients.get(i).getId().equals(id)) {
                clients.set(i,updateClient);
                return;
            }
        }
    }

    public void deleteClient(String id) {
        for (int i=0; i < clients.size(); i++) {
            if (clients.get(i).getId().equals(id)) {
                clients.remove(i);
                return;
            }
        }
    }

    public ClientRepository() {

        clients.add(new Client("1","nsilva","nicolas","nsilva@duocuc.cl",
            new ProfileInfo("Buscando la vida","Estudiante Duoc",
                            "/img/feed/profile.png","560","1000","500")));


        clients.add(new Client("2","lolivares","leonardo","lolivares@duocuc.cl",
        new ProfileInfo("Buscando trabajo","Estudiante Duoc Online",
        "/img/feed/profile_2.png","650","950","7500")));

        clients.add(new Client("3","javier","javier","javier@duocuc.cl",
        new ProfileInfo("Buscando vacaciones","Estudiante Duoc Online 2",
        "/img/feed/profile_3.png","950","1950","17500")));

    }

}

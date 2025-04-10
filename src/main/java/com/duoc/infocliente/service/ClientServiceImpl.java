package com.duoc.infocliente.service;

import org.springframework.stereotype.Service;
import com.duoc.infocliente.model.Client;
import com.duoc.infocliente.repository.ClientRepository;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    private final ClientRepository clientRepository = new ClientRepository();

    @Override
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public void createClient(Client client) {
        clientRepository.addClient(client);
    }
}

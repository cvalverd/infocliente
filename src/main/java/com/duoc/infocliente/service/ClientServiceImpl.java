package com.duoc.infocliente.service;
import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.duoc.infocliente.model.Client;
import com.duoc.infocliente.repository.ClientRepository;
import com.duoc.infocliente.exceptionhandler.*;

import lombok.RequiredArgsConstructor;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {

        return clientRepository.save(client);
            
    }

    @Override
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client updateClient(Long id, Client client) {

        if(clientRepository.existsById(id)){
            client.setId(id);
            return clientRepository.save(client);
        }   else {
            return null;
        }
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}

package com.ibm.restaurant.application.clients;

import com.ibm.restaurant.domain.Client;
import com.ibm.restaurant.domain.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void createClient(Client client){
        long id  = getClientList().size() + 1;
        client.setId(id);
        clientRepository.createClient(client);
    }

    public Client getClientById(Long id){
        return clientRepository.getClientById(id);
    }

    public HashSet<Client> getClientList(){
        return clientRepository.getClientList();
    }
}

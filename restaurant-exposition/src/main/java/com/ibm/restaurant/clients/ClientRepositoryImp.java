package com.ibm.restaurant.clients;

import com.ibm.restaurant.domain.Client;
import com.ibm.restaurant.domain.ClientRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class ClientRepositoryImp implements ClientRepository {

    Set<Client> clientSet = new HashSet<>();
    @Override
    public void createClient(Client client) {
        clientSet.add(client);
        for(Client client1 : clientSet){
            System.out.println("======== set element: " + client1.toString());
        }
    }

    @Override
    public Client getClientById(Long id) {
        List<Client> clientList = new ArrayList<>(clientSet);
        for(Client client : clientList){
            if(id.equals(client.getId())){
                return client;
            }
        }
        return null;
    }

    @Override
    public HashSet<Client> getClientList() {

        return new HashSet<>(clientSet);
    }

    @Override
    public void updateClientById(Client client) {
        clientSet.remove(client);
        clientSet.add(client);
    }
}

package com.ibm.restaurant.domain;

import java.util.HashSet;

public interface ClientRepository {

    void createClient(Client client);

    Client getClientById(Long id);

    HashSet<Client> getClientList();

    void updateClientById(Client client);
}

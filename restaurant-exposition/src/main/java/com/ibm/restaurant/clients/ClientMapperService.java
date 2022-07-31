package com.ibm.restaurant.clients;

import com.ibm.restaurant.domain.Client;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class ClientMapperService {

    public Client mapToDomain(ClientDto clientDto){
        Client client = new Client();
        client.setId(clientDto.id);
        client.setFirstName(clientDto.firstName);
        client.setLastName(clientDto.lastName);
        client.setAdress(clientDto.adress);
        client.setPhoneNumber(clientDto.phoneNumber);
        client.setEmail(clientDto.email);
        client.setWallet(clientDto.wallet);
        return client;
    }

    public ClientDto mapFromDomain(Client client){
        ClientDto clientDto = new ClientDto();
        clientDto.firstName = client.getFirstName();
        clientDto.lastName = client.getLastName();
        clientDto.adress = client.getAdress();
        clientDto.phoneNumber = client.getPhoneNumber();
        clientDto.email = client.getEmail();
        clientDto.wallet = client.getWallet();
        return clientDto;
    }

    public HashSet<ClientDto> mapFromDomain(HashSet<Client> clientList){
        HashSet<ClientDto> list = new HashSet<>();
        for(Client client : clientList){
            list.add(mapFromDomain(client));
        }
        return list;
    }
}

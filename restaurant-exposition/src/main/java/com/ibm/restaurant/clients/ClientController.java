package com.ibm.restaurant.clients;

import com.ibm.restaurant.application.clients.ClientService;
import com.ibm.restaurant.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientMapperService clientMapperService;

    @PostMapping
    public ResponseEntity<Void> createClient(@RequestBody ClientDto clientDto){
        Client client = clientMapperService.mapToDomain(clientDto);
        clientService.createClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> getClientById(@PathVariable Long id){
        Client client = clientService.getClientById(id);
        ClientDto clientDto = clientMapperService.mapFromDomain(client);
        return ResponseEntity.status(HttpStatus.OK).body(clientDto);
    }

    @GetMapping
    public ResponseEntity<HashSet<ClientDto>> getClientList(){
        HashSet<Client> clientList = clientService.getClientList();
        HashSet<ClientDto> clientDtos = clientMapperService.mapFromDomain(clientList);
        return ResponseEntity.status(HttpStatus.OK).body(clientDtos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateClientById(@PathVariable Long id, @RequestBody ClientDto clientDto){
        Client client = clientMapperService.mapToDomain(clientDto);
        clientService.updateClientById(id, client);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

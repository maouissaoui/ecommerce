package com.supinfo.ecommerce.service;

import com.supinfo.ecommerce.model.Client;
import com.supinfo.ecommerce.repository.ClientRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bson.types.ObjectId;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

   // Client client = new Client( ObjectId("5ec1c2f84f1dde19fcc519cb"), "Saintil", "Mimose", "06/04/1992", "FRANCE", "All�e des amandiers", " ", "13001", "75360708");
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }





}

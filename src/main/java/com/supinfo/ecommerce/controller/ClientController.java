package com.supinfo.ecommerce.controller;

import com.supinfo.ecommerce.model.Client;
import com.supinfo.ecommerce.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@NoRepositoryBean
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    ClientService clientService;


    @GetMapping("clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

}

package tn.spring.service;

import tn.spring.entities.Client;

import java.util.List;

public interface IClient {
    void createClient(Client client);
    Client updateClient(Client client);
    void deleteClient( Long id);
    Client retrieveClientById(Long id);
    List<Client> retriveClients();
}

package tn.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.entities.Client;
import tn.spring.entities.Contrat;
import tn.spring.repository.ClientRepository;
import tn.spring.repository.ContratRepository;

import java.util.List;
import java.util.Set;
@Service
@AllArgsConstructor
public class ClientServiceIMP implements IClient{
    @Autowired
    ClientRepository clientRepository;
    ContratRepository contratRepository;
    @Override
    public void createClient(Client client) {
        Contrat contrat = savecontrat(client);
        contrat.setClient(client);
        clientRepository.save(client);
    }

    public Contrat savecontrat(Client client) {
        Set<Contrat> boutiques = client.getContrats();
        for (Contrat b : boutiques) {
            return contratRepository.save(b);
        }
        return null;
    }
    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client retrieveClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> retriveClients() {
        return clientRepository.findAll();
    }

}

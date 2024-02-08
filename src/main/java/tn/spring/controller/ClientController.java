package tn.spring.controller;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tn.spring.entities.Client;
import tn.spring.service.IClient;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
public class ClientController  {
    @Autowired
    IClient iClient;

    @PostMapping("/addClient")
    public void createClient(@RequestBody Client client){
        iClient.createClient(client);
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client client){

        return iClient.updateClient(client);


    }
    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable("id") Long id) {

        iClient.deleteClient(id);
    }

    @GetMapping("/retrieveClientById/{id}")
    public Client retrieveClient(@PathVariable("id") Long id){
        return iClient.retrieveClientById(id);
    }
    @GetMapping("/")
    public ModelAndView index(){
        final var modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping("/retriveClients")
    public List<Client> retriveClients()
    {
        return iClient.retriveClients();
    }

}

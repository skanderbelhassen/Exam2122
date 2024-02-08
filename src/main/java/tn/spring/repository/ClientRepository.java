package tn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

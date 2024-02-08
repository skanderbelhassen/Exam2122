package tn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}

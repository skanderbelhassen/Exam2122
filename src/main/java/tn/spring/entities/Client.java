package tn.spring.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;
    private String nom_client;
    private String adresse_client;
    private String login_client;
    private String password_client;

    public void setId(Long id) {
        this.id_client = id;
    }

    public Long getId() {
        return id_client;
    }

    @OneToMany(mappedBy = "client")
    private Set<Contrat> Contrats;
}

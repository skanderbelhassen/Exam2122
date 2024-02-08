package tn.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contrat;
    private String nom_contrat;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    public void setId(Long id) {
        this.id_contrat = id_contrat;
    }

    public Long getId() {
        return id_contrat;
    }

    @ManyToOne
    @JsonIgnore
    private Client client;

}

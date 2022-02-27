package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Client extends SuperEntity{
    private String nom;
    private String prenom;
    @Embedded
    private Adresse adresse;
    private String photo;
    private String email;
    private String numTel;
  @OneToMany(mappedBy = "commandeClient")
    private List<CommandeClient> commandeClient;
}

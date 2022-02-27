package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommandeFournisseur extends SuperEntity{
    private String codeCommande;
    private Instant dateCommande;
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClientList;
    @ManyToOne
    private Fournisseur fournisseur;

}

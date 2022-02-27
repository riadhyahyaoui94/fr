package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LigneCommandeClient extends SuperEntity{
    @ManyToOne
    private CommandeClient commandeClient;
    @ManyToOne
    private Produit produit;
}

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
public class LigneCommandeFournisseur extends SuperEntity{
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private CommandeFournisseur commandeFournisseur;
}

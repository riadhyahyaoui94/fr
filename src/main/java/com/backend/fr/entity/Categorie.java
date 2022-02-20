package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categorie extends SuperEntity {

    private String codeCategorie;
    private String nomCategorie;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;


}


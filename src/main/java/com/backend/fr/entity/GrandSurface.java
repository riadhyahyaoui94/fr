package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Embeddable;
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

public class GrandSurface extends SuperEntity{
    private String nom;
    private String description;
    @Embedded
    private Adresse adresse;
    private String codeFiscal;
    private String photo;
    private String email;
    private String numTel;
    private String siteWeb;

    @OneToMany(mappedBy = "grandSurface")
    private List<Produit> produit;
@OneToMany(mappedBy = "grandSurface")
    private List<Utilisateur> utilisateurs;


}

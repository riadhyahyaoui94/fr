package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Utilisateur extends SuperEntity{
    private String nom;
    private String prenom;
    private String email;
    private Instant dateDeNaissance;
    private String motDePasse;
    @Embedded
    private Adresse adresse;
    private String photo;

    @ManyToOne
    private GrandSurface grandSurface;
   @OneToMany(mappedBy = "utilisateurs")
    private List<Role> roles;
}

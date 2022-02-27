package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Adresse {

    private String adresse1;
    private String adresse2;
    private String ville;
    private String pays;
    private int codePostal;
    private String cite;

}

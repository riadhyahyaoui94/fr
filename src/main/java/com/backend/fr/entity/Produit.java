package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit extends SuperEntity{
private String codeProduit;
private String description;
private BigDecimal prixUnitaire;
private BigDecimal tva;
private  BigDecimal prixUnitaireTTc;
private String photo;
@ManyToOne
private Categorie categorie;
@OneToMany(mappedBy = "produit")
private List<MvtStock> mvtStocks;
}

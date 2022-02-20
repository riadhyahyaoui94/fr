package com.backend.fr.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MvtStock extends SuperEntity{
    private Instant dateMvt;
    private int quantite;
    @Enumerated(EnumType.STRING)
    private TypeMvtStock typeMvtStock;
    @ManyToOne
    private Produit produit;
}

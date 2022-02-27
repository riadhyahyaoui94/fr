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
public class Role extends SuperEntity {
    private String nomRole;

    @ManyToOne
    private Utilisateur utilisateurs;
}

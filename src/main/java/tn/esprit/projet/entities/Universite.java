package tn.esprit.projet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite implements Serializable
{

    @Id
    @GeneratedValue
    long idUniversite;
    @Column(unique = true)
    String nomUniversite;
    String adresse;
    @OneToOne
    private Foyer foyer;
}

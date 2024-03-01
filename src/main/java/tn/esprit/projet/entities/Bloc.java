package tn.esprit.projet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc implements Serializable
{
    @Id
    @GeneratedValue
    long idBloc;

   String nomBloc;

   long capaciteBloc;

    @ManyToOne
    Foyer foyer;
    @OneToMany( mappedBy="bloc")
    private Set<Chambre> chambres;


}

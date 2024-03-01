package tn.esprit.projet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation implements Serializable {
    @Id
    @GeneratedValue
    String idReservation;
    Date anneeUniv;
    boolean estValide;
    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;
}

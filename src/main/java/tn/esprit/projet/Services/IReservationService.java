package tn.esprit.projet.Services;

import tn.esprit.projet.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation getReservation(String id);
    List<Reservation> getAllReservations();
    void deleteReservation(String idReservation);
    Reservation updateReservation(Reservation reservation);
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite) ;
}

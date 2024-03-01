package tn.esprit.projet.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet.Repositories.ReservationRepository;
import tn.esprit.projet.entities.Foyer;
import tn.esprit.projet.entities.Reservation;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{

    ReservationRepository reservationRepository;



    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservation(String id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public void deleteReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        Reservation res=reservationRepository.findById(reservation.getIdReservation()).orElse(null);
        if (res!=null)
            reservationRepository.save(reservation);
        return  res;
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite) {
        return null;
    }
}

package tn.esprit.projet.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.Services.IFoyerService;
import tn.esprit.projet.Services.IReservationService;
import tn.esprit.projet.entities.Foyer;
import tn.esprit.projet.entities.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/addreservation")
    Reservation addReservation (@RequestBody Reservation reservation){
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/reservation/{id}")
    Reservation retrieveReservation(@PathVariable String id){

        return reservationService.getReservation(id);
    }

    @GetMapping("/reservations")
    List<Reservation> retrieveReservation(Reservation reservation){

        return reservationService.getAllReservations();
    }


    @PutMapping("/reservation")
    Reservation updateReservation (@RequestBody Reservation reservation)
    {
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/reservation/{id}")
    void deleteReservation(@PathVariable String id){

        reservationService.deleteReservation(id);
    }
}

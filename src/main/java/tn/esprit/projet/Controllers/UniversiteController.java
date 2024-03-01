package tn.esprit.projet.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.Services.IReservationService;
import tn.esprit.projet.Services.IUniversiteService;
import tn.esprit.projet.entities.Reservation;
import tn.esprit.projet.entities.Universite;

import java.util.List;
@CrossOrigin("http://localhost:4200")

@RestController
@AllArgsConstructor
public class UniversiteController {
    IUniversiteService universiteService;

    @PostMapping("/adduniversite")
    Universite addUniversite (@RequestBody Universite universite){
        return universiteService.addUniversite(universite);
    }

    @GetMapping("/universite/{id}")
    Universite retrieveUniversite(@PathVariable Long id){

        return universiteService.getUniversite(id);
    }

    @GetMapping("/universites")
    List<Universite> retrieveUniversite(Universite universite){

        return universiteService.getAllUniversites();}

    @PutMapping("/universite")
    Universite updateUniversite (@RequestBody Universite universite)
    {
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/universite/{id}")
    void deleteUniversite(@PathVariable long id){

        universiteService.deleteUniversite(id);
    }
}


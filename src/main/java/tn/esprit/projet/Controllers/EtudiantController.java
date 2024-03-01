package tn.esprit.projet.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.Services.IEtudiantService;
import tn.esprit.projet.entities.Bloc;
import tn.esprit.projet.entities.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/addetudiant")
    Etudiant addEtudiant (@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }

    @GetMapping("/etudiant/{id}")
    Etudiant retrieveEtudiant(@PathVariable Long id){

        return etudiantService.getEtudiant((id));
    }

    @GetMapping("/etudiants")
    List<Etudiant> retrieveEtudiant(Etudiant etudiant){

        return etudiantService.getAllEtudiants();
    }


    @PutMapping("/etudiants")
    Etudiant updateEtudiant (@RequestBody Etudiant etudiant)
    {
        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/etudiant/{id}")
    void deleteEtudiant(@PathVariable Long id){

        etudiantService.deleteEtudiant(id);
    }
}

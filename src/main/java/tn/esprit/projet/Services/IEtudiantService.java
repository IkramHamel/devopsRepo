package tn.esprit.projet.Services;

import tn.esprit.projet.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant getEtudiant(Long id);
    List<Etudiant> getAllEtudiants();
    void deleteEtudiant(long idEtudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
}

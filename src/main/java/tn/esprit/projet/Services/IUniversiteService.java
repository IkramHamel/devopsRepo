package tn.esprit.projet.Services;

import tn.esprit.projet.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite getUniversite(Long id);
    List<Universite> getAllUniversites();
    void deleteUniversite(long idUniversite);
    Universite updateUniversite(Universite universite);
    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;
    public Universite desaffecterFoyerAUniversite (long idUniversite) ;
}

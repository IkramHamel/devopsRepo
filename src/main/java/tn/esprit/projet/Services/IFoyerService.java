package tn.esprit.projet.Services;

import tn.esprit.projet.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer getFoyer(Long id);
    List<Foyer> getAllFoyers();
    void deleteFoyer(long idFoyer);
    Foyer updateFoyer(Foyer foyer);
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;

}

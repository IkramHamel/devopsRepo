package tn.esprit.projet.Services;


import tn.esprit.projet.entities.Chambre;
import tn.esprit.projet.entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre getChambre(Long id);
    List<Chambre> getAllChambres();
    void deleteChambre(long idChambre);
    Chambre updateChambre(Chambre chambre);
    public List<Chambre> getChambresParNomUniversite( String nomUniversite) ;
    public List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre typeC) ;
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite,TypeChambre type) ;

}

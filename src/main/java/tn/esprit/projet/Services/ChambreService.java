package tn.esprit.projet.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet.Repositories.ChambreRepository;
import tn.esprit.projet.entities.Bloc;
import tn.esprit.projet.entities.Chambre;
import tn.esprit.projet.entities.TypeChambre;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {


    ChambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambre(Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        Chambre ch = chambreRepository.findById(chambre.getIdChambre()).orElse(null);
        if (ch != null)
            chambreRepository.save(chambre);
        return ch;
    }

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {
        return chambreRepository.findChambresByUniversite(nomUniversite);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepository.findByBloc_IdBlocAndTypeChambre(idBloc, typeC);
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type) {
        return chambreRepository.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite,type);
    }
}
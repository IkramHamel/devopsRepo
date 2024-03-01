package tn.esprit.projet.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet.Repositories.FoyerRepository;
import tn.esprit.projet.Repositories.UniversiteRepository;
import tn.esprit.projet.entities.Foyer;
import tn.esprit.projet.entities.Reservation;
import tn.esprit.projet.entities.Universite;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{

     UniversiteRepository universiteRepository;
     FoyerRepository foyerRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public void deleteUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        Universite univ=universiteRepository.findById(universite.getIdUniversite()).orElse(null);
        if (univ!=null)
            universiteRepository.save(universite);
        return  univ;
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer=foyerRepository.findById(idFoyer).orElse(null);
        Universite universite=universiteRepository.findUniversitesByNomUniversite(nomUniversite);
        universite.setFoyer(foyer);
        return  universiteRepository.save(universite);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite=universiteRepository.findById(idUniversite).orElse(null);
        universite.setFoyer(null);
      return universiteRepository.save(universite);
    }
}

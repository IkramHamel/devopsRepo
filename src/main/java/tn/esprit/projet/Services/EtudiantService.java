package tn.esprit.projet.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet.Repositories.EtudiantRepository;
import tn.esprit.projet.entities.Chambre;
import tn.esprit.projet.entities.Etudiant;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

    EtudiantRepository etudiantRepository;


    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiant(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        Etudiant et=etudiantRepository.findById(etudiant.getIdEtudiant()).orElse(null);
        if (et!=null)
            etudiantRepository.save(etudiant);
        return  et;
    }
}

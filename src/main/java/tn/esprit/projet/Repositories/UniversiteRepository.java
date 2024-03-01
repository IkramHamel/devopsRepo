package tn.esprit.projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findUniversitesByNomUniversite (String nomUniversite);
}

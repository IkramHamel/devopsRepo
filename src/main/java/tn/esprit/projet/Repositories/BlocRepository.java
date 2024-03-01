package tn.esprit.projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByNomBloc(String nom);
}

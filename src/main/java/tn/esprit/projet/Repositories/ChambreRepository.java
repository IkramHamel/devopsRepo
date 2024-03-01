package tn.esprit.projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.projet.entities.Chambre;
import tn.esprit.projet.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    Chambre findByNumeroChambre(Long num);


    @Query("select c from Chambre c , Bloc b ,Foyer f,Universite u where c.bloc=b and b.foyer=f and  f.universite=u and u.nomUniversite=?1 group by ?1 ")
    List<Chambre> findChambresByUniversite(String nomUniversite);

    List<Chambre> findByBloc_IdBlocAndTypeChambre(long idBloc, TypeChambre typeC);
    @Query("select c from Chambre c,Universite u, Bloc b ,Foyer f ,Reservation r where c.bloc=b and b.foyer=f and f.universite=u and u.nomUniversite=?1 and c.typeChambre= ?2")
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite,TypeChambre type) ;
}

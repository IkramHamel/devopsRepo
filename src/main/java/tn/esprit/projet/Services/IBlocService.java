package tn.esprit.projet.Services;

import tn.esprit.projet.entities.Bloc;

import java.util.List;
public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc getBloc(Long id);
    List<Bloc> getAllBlocs();
    void deleteBloc(long idBloc);
    Bloc updateBloc(Bloc bloc);
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) ;

}

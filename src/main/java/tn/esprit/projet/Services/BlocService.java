package tn.esprit.projet.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet.Repositories.BlocRepository;
import tn.esprit.projet.Repositories.ChambreRepository;
import tn.esprit.projet.entities.Bloc;
import tn.esprit.projet.entities.Chambre;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BlocService implements IBlocService{

    BlocRepository blocRepository;
    ChambreRepository chambreRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBloc(Long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public void deleteBloc(long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        Bloc bl=blocRepository.findById(bloc.getIdBloc()).orElse(null);
        if (bl!=null)
            blocRepository.save(bloc);
        return  bl;
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        Bloc bloc =blocRepository.findById(idBloc).orElse(null);
        for(Long C:numChambre){
           Chambre chambre =chambreRepository.findByNumeroChambre(C);
          chambre.setBloc(bloc);
            chambreRepository.save(chambre);

        }
        return bloc;
    }

    /**@Override
  public   Bloc affecterChambresABloc(List<Long>numChambre,String nomBloc){
        Bloc bloc=blocRepository.findByNomBloc(nomBloc);
        for(Long num : numChambre){
            Chambre chambre = chambreRepository.findByNumeroChambre(num);
        }
        return null;
}**/

}






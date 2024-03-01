package tn.esprit.projet.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.Services.IBlocService;
import tn.esprit.projet.entities.Bloc;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocController {
    IBlocService blocService;


    @PostMapping("/addbloc")
    Bloc addBloc (@RequestBody Bloc bloc){
        return blocService.addBloc(bloc);
    }

    @GetMapping("/bloc/{id}")
    Bloc retrieveBloc(@PathVariable Long id){
        return blocService.getBloc((id));
    }

    @GetMapping("/blocs")
    List<Bloc> retrieveBlocs(Bloc bloc){
        return blocService.getAllBlocs();
    }


    @PutMapping("/bloc")
    Bloc updateBloc (@RequestBody Bloc bloc)
    {
        return blocService.updateBloc(bloc);
    }

    @DeleteMapping("/bloc/{id}")
    void deleteBloc(@PathVariable Long id){

        blocService.deleteBloc(id);
    }
    @PutMapping("/affecterchambres/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody  List<Long> numChambre, @PathVariable long idBloc){
return blocService.affecterChambresABloc(numChambre,idBloc);
    }


}

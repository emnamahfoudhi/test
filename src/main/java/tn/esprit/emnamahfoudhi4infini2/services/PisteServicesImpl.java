package tn.esprit.emnamahfoudhi4infini2.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;
import tn.esprit.emnamahfoudhi4infini2.Repository.IPiste;
import tn.esprit.emnamahfoudhi4infini2.Repository.ISkieur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class PisteServicesImpl implements IPisteservice  {
    //@Autowired mais @ALLLARGSCONSTRUCTOR  est plus recommondee

    private IPiste pisteRep;
    private ISkieur skieurrep;


    @Override
    public Piste addPiste(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public Piste findPisteById(Long numPiste) {
        return pisteRep.findById(numPiste).orElse(null);
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRep.deleteById(numPiste);

    }

    @Override
    public List<Piste> getAll() {
        return (List<Piste>) pisteRep.findAll();
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public Piste assignskieurtopiste(Long numskieur, Long numPiste) {
        Skieur skieur = skieurrep.findById(numskieur).orElse(null);
        Piste piste = pisteRep.findById(numPiste).orElse(null);
        if(piste.getSkieur() == null){
            Set<Skieur> skieurset = new HashSet<>();
            skieurset.add(skieur);
            piste.setSkieur(skieurset);
        }
        else
            piste.getSkieur().add(skieur);

       return pisteRep.save(piste);
    }


}

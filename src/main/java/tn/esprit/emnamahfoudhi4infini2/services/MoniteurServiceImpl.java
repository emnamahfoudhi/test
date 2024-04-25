package tn.esprit.emnamahfoudhi4infini2.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.emnamahfoudhi4infini2.Entities.Cours;
import tn.esprit.emnamahfoudhi4infini2.Entities.Moniteur;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;
import tn.esprit.emnamahfoudhi4infini2.Entities.Support;
import tn.esprit.emnamahfoudhi4infini2.Repository.ICours;
import tn.esprit.emnamahfoudhi4infini2.Repository.IMoniteur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class MoniteurServiceImpl implements IMoniteurService {
    private IMoniteur moniteurrep;
    private ICours coursrepo;
    @Override
    public Moniteur addPmoniteur(Moniteur m) {
        return moniteurrep.save(m);
    }

    @Override
    public Moniteur findmoniteurById(Long nummon) {
        return moniteurrep.findById(nummon).orElse(null);
    }

    @Override
    public void deletemon(Long nummon) {
        moniteurrep.deleteById(nummon);

    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>) moniteurrep.findAll();
    }

    @Override
    public Moniteur updatemon(Moniteur m) {
        return moniteurrep.save(m);
    }

@Transactional
    @Override
    public Moniteur addinstructorandassigntocourse(Moniteur moniteur, Long numcours) {
        Cours cours = coursrepo.findById(numcours).orElse(null);
        moniteurrep.save(moniteur);
        if(moniteur.getCours() == null){
            Set<Cours> coursset = new HashSet<>();
            coursset.add(cours);
            moniteur.setCours(coursset);
        }
        else
           moniteur.getCours().add(cours);
        return moniteurrep.save(moniteur);
    }

    @Override
    public Moniteur addinstructorandassigntocoursebysupport(Moniteur moniteur, Support support) {
        List<Cours> coursList = coursrepo.findBySupport(support);
        for (Cours cours : coursList){
            moniteur.getCours().add(cours);
        }
        return moniteurrep.save(moniteur);
    }
}

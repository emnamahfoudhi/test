package tn.esprit.emnamahfoudhi4infini2.services;

import tn.esprit.emnamahfoudhi4infini2.Entities.Moniteur;
import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;
import tn.esprit.emnamahfoudhi4infini2.Entities.Support;

import java.util.List;

public interface IMoniteurService {
    Moniteur addPmoniteur (Moniteur m);
    Moniteur findmoniteurById (Long nummon);
    void deletemon(Long nummon);
    List<Moniteur> getAll();
    Moniteur updatemon(Moniteur m);
    Moniteur addinstructorandassigntocourse(Moniteur moniteur,Long numcours);
    Moniteur addinstructorandassigntocoursebysupport(Moniteur moniteur, Support support);
}


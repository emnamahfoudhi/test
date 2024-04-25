package tn.esprit.emnamahfoudhi4infini2.services;

import tn.esprit.emnamahfoudhi4infini2.Entities.Cours;


import java.util.List;

public interface ICoursService {
    Cours addcours (Cours c);
    Cours findCoursById (Long numc);
    void deleteCours(Long numCours);
    List<Cours> getAll();
    Cours updatecours(Cours c);


}

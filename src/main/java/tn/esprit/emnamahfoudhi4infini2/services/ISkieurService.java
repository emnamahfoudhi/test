package tn.esprit.emnamahfoudhi4infini2.services;

import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;
import tn.esprit.emnamahfoudhi4infini2.Entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    Skieur addsk (Skieur s);
    Skieur findskById (Long numsk);
    void deletesk(Long numsk);
    List<Skieur> getAll();
    Skieur updatesk(Skieur s);
    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    //void retrieve();
   // void retrieveskieursbyexpirementsub ();


}

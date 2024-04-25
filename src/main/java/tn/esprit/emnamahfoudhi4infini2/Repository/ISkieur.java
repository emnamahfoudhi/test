package tn.esprit.emnamahfoudhi4infini2.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;
import tn.esprit.emnamahfoudhi4infini2.Entities.TypeAbonnement;

import java.util.List;

@Repository
public interface ISkieur extends CrudRepository<Skieur,Long> {
    @Query("select s  from  Skieur s where s.abonnement.typeAbon=:typeabonnement")
    List<Skieur> retrieveSkiersBySubscriptionType(@Param("typeabonnement") TypeAbonnement typeAbonnement);

    @Query("select s from Skieur s where s.abonnement.dateFin < current date ")
    List<Skieur> retrieveskieursbysubscriptionexpirement ();
}


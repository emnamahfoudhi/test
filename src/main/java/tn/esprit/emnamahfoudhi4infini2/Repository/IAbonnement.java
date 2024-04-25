package tn.esprit.emnamahfoudhi4infini2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.emnamahfoudhi4infini2.Entities.Abonnement;

@Repository
public interface IAbonnement extends CrudRepository<Abonnement,Long> {
}

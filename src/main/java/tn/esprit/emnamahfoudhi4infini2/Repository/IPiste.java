package tn.esprit.emnamahfoudhi4infini2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.emnamahfoudhi4infini2.Entities.Couleur;
import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;

import java.util.List;

@Repository

public interface IPiste extends CrudRepository<Piste,Long> {
List<Piste> findByCouleur(Couleur couleur);
}

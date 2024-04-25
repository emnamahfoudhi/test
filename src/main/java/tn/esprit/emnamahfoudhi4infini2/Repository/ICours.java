package tn.esprit.emnamahfoudhi4infini2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.emnamahfoudhi4infini2.Entities.Cours;
import tn.esprit.emnamahfoudhi4infini2.Entities.Support;

import java.util.List;

@Repository

public interface ICours extends CrudRepository<Cours,Long> {
    List<Cours> findBySupport(Support support);
}

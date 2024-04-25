package tn.esprit.emnamahfoudhi4infini2.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.emnamahfoudhi4infini2.Entities.Cours;
import tn.esprit.emnamahfoudhi4infini2.Repository.ICours;

import java.util.List;

@Service
@AllArgsConstructor

public class CoursService implements ICoursService{
    private ICours coursrep;
    @Override
    public Cours addcours(Cours c) {
        return coursrep.save(c);
    }

    @Override
    public Cours findCoursById(Long numc) {
        return coursrep.findById(numc).orElse(null);
    }

    @Override
    public void deleteCours(Long numCours) { coursrep.deleteById(numCours);

    }

    @Override
    public List<Cours> getAll() {
        return (List<Cours>) coursrep.findAll();
    }

    @Override
    public Cours updatecours(Cours c) {
        return coursrep.save(c);
    }
}

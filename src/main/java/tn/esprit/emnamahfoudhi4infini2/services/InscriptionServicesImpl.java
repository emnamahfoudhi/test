package tn.esprit.emnamahfoudhi4infini2.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.emnamahfoudhi4infini2.Entities.Cours;
import tn.esprit.emnamahfoudhi4infini2.Entities.Inscription;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;
import tn.esprit.emnamahfoudhi4infini2.Repository.ICours;
import tn.esprit.emnamahfoudhi4infini2.Repository.IInscription;
import tn.esprit.emnamahfoudhi4infini2.Repository.ISkieur;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServicesImpl implements IInscriptionservice  {
    //@Autowired mais @ALLLARGSCONSTRUCTOR  est plus recommondee

    private IInscription InscriptionRep;
    private ISkieur skieurrep;
    private ICours coursrep;


    @Override
    public Inscription addInscription(Inscription p) {
        return InscriptionRep.save(p);
    }

    @Override
    public Inscription findInscriptionById(Long numInscription) {
        return InscriptionRep.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(Long numInscription) {
        InscriptionRep.deleteById(numInscription);

    }

    @Override
    public List<Inscription> getAll() {
        return (List<Inscription>) InscriptionRep.findAll();
    }

    @Override
    public Inscription updateInscription(Inscription p) {
        return InscriptionRep.save(p);
    }

    @Override
    public Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkier) {
        Skieur skieur = skieurrep.findById(numSkier).orElse(null);
        inscription.setSkieur(skieur);
        return InscriptionRep.save(inscription);
    }

    @Override
    public Inscription assigninscriptiontocours(Long numinscri, Long numcours) {
        Cours cours = coursrep.findById(numcours).orElse(null);
        Inscription inscription = InscriptionRep.findById(numinscri).orElse(null);
        inscription.setCours(cours);
        return InscriptionRep.save(inscription);





    }


}

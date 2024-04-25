package tn.esprit.emnamahfoudhi4infini2.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.emnamahfoudhi4infini2.Entities.Cours;
import tn.esprit.emnamahfoudhi4infini2.Entities.Inscription;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;
import tn.esprit.emnamahfoudhi4infini2.Entities.TypeAbonnement;
import tn.esprit.emnamahfoudhi4infini2.Repository.ICours;
import tn.esprit.emnamahfoudhi4infini2.Repository.IInscription;
import tn.esprit.emnamahfoudhi4infini2.Repository.ISkieur;

import java.util.List;

@Service
@Slf4j//lombok khater nheb nestaamel logger fi 3oudh println
@AllArgsConstructor

public class SkieurServiceImpl implements ISkieurService{
    private ISkieur skieurrep;
    private ICours coursrep;
    private IInscription inscrirep;

    @Override
    public Skieur addsk(Skieur s) {
        return skieurrep.save(s);
    }

    @Override
    public Skieur findskById(Long numsk) {
        return skieurrep.findById(numsk).orElse(null);
    }

    @Override
    public void deletesk(Long numsk) {
        skieurrep.deleteById(numsk);

    }

    @Override
    public List<Skieur> getAll() {
        return (List<Skieur>) skieurrep.findAll();
    }

    @Override
    public Skieur updatesk(Skieur s) {
        return skieurrep.save(s);
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours) {
        Cours cours = coursrep.findById(numCours).orElse(null);
        Skieur s = skieurrep.save(skieur);
        for(Inscription i : s.getInscriptions()) {
            i.setSkieur(s);
           // i.setCours(cours);
            inscrirep.save(i);
        }
        return s;


    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurrep.retrieveSkiersBySubscriptionType(typeAbonnement);
    }

   // @Override
    //@Scheduled(cron = "*/15 * * * * *")
   /* public void retrieve() {
        for(Skieur s:skieurrep.findAll())
            System.out.println(s.getNomS());

    }*/

   //@Override
   // @Scheduled(cron = "*/15 * * * * *")
   /* public void retrieveskieursbyexpirementsub() {
       // System.out.println("methode retrieve");
        log.debug("method retrieve");
        for(Skieur s:skieurrep.retrieveskieursbysubscriptionexpirement())
            //System.out.println(s);
            log.info(s.toString());

        log.warn("Attention");
        log.error("Error");



    }*/




}

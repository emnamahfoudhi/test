package tn.esprit.emnamahfoudhi4infini2.services;

import tn.esprit.emnamahfoudhi4infini2.Entities.Inscription;

import java.util.List;

public interface IInscriptionservice {
    Inscription addInscription (Inscription p);
    Inscription findInscriptionById (Long numInscription);
    void deleteInscription(Long numInscription);
    List<Inscription> getAll();
    Inscription updateInscription(Inscription p);
    Inscription addInscriptionAndAssignToSkier(Inscription inscription , Long numSkier);
    Inscription assigninscriptiontocours (Long numinscri,Long numcours);
}

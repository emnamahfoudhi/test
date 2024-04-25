package tn.esprit.emnamahfoudhi4infini2.services;

import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;

import java.util.List;

public interface IPisteservice {
    Piste addPiste (Piste p);
    Piste findPisteById (Long numPiste);
    void deletePiste(Long numPiste);
    List<Piste> getAll();
    Piste updatePiste(Piste p);
    Piste assignskieurtopiste(Long numskieur,Long numPiste);
}

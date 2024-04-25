package tn.esprit.emnamahfoudhi4infini2.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.emnamahfoudhi4infini2.Entities.Moniteur;
import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;
import tn.esprit.emnamahfoudhi4infini2.Entities.Support;
import tn.esprit.emnamahfoudhi4infini2.services.IMoniteurService;
import tn.esprit.emnamahfoudhi4infini2.services.IPisteservice;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Moniteur")

public class MoniteurRestController {
    private IMoniteurService moniteurservices;



        @PostMapping("/save")
        public Moniteur addmon(@RequestBody Moniteur m ){
            return moniteurservices.addPmoniteur(m);
        }
        @GetMapping("/findbyid/{idm}")
        public Moniteur findmonbyid(@PathVariable Long idm){
            return moniteurservices.findmoniteurById(idm);
        }

        @DeleteMapping("deletemon/{idm}")
        public String deletemon(@PathVariable Long idm){
            moniteurservices.deletemon(idm);
            return "piste deleted !";
        }
        @GetMapping("/all")
        public List<Moniteur> getallmon(){
            return moniteurservices.getAll();
        }
        @PutMapping("/updatemon")
        public Moniteur updatemon(@RequestBody Moniteur m)
        {
            return moniteurservices.updatemon(m);
        }
        @PutMapping("/assignmoniteurcours/{coursid}")
    public Moniteur assignmontocours(@RequestBody Moniteur moniteur,@PathVariable Long coursid)
        {
            return moniteurservices.addinstructorandassigntocourse(moniteur,coursid);
        }
    @PutMapping("/assignmoniteurcoursbysupport/{support}")
    public Moniteur assignmontocoursbysupport(@RequestBody Moniteur moniteur, @PathVariable Support support)
    {
        return moniteurservices.addinstructorandassigntocoursebysupport(moniteur,support);
    }
}

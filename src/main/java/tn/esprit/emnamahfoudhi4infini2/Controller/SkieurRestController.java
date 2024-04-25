package tn.esprit.emnamahfoudhi4infini2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;
import tn.esprit.emnamahfoudhi4infini2.Entities.Skieur;
import tn.esprit.emnamahfoudhi4infini2.Entities.TypeAbonnement;
import tn.esprit.emnamahfoudhi4infini2.services.ISkieurService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Skieur")

public class SkieurRestController {
    private ISkieurService skieurservice;

    @PostMapping("/save")
    public Skieur addsk(@RequestBody Skieur sk) {
        return skieurservice.addsk(sk);
    }

    @GetMapping("/findbyid/{idsk}")
    public Skieur findskbyid(@PathVariable Long idsk) {
        return skieurservice.findskById(idsk);
    }

    @DeleteMapping("deletesk/{idsk}")
    public String deletesk(@PathVariable Long idsk) {
        skieurservice.deletesk(idsk);
        return "skieur deleted !";
    }

    @GetMapping("/all")
    public List<Skieur> getallskieurs() {
        return skieurservice.getAll();
    }

    @PutMapping("/updatesk")
    public Skieur updatesk(@RequestBody Skieur s) {
        return skieurservice.updatesk(s);
    }

    @PutMapping("/skieurabonninscritocours/{idcours}")
    public Skieur addskierandassigntocourse(@RequestBody Skieur s, @PathVariable Long idcours) {
        return skieurservice.addSkierAndAssignToCourse(s, idcours);
    }

    @GetMapping("/retrieveSkiersBySubscriptionType/{typeabonnement}")
    public List<Skieur> retrieveSkiersBySubscriptionType(@PathVariable TypeAbonnement typeabonnement) {
        return skieurservice.retrieveSkiersBySubscriptionType(typeabonnement);
    }

    /*@GetMapping("/getlistskieursevery15s")
    public void retrievelistevery15s() {
        skieurservice.retrieve();
    }*/

   /* @GetMapping("/retrieveskieursbyexpirementsub")

        public void retrieveskieursbyexpirementsub()
        {
            skieurservice.retrieveskieursbyexpirementsub();
        }*/

}
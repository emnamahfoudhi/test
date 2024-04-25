package tn.esprit.emnamahfoudhi4infini2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.emnamahfoudhi4infini2.Entities.Inscription;
import tn.esprit.emnamahfoudhi4infini2.services.IInscriptionservice;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Inscription")

public class InscriptionRestController {
    private IInscriptionservice InscriptionService ;
    @PostMapping("/save")
    public Inscription addInscription(@RequestBody Inscription Inscription ){
        return InscriptionService.addInscription(Inscription);
    }
    @GetMapping("/findbyid/{idInscription}")
    public Inscription findInscriptionbyid(@PathVariable Long idInscription){
        return InscriptionService.findInscriptionById(idInscription);
    }

    @DeleteMapping("deleteInscription/{idInscription}")
    public String deleteInscription(@PathVariable Long idInscription){
        InscriptionService.deleteInscription(idInscription);
        return "Inscription deleted !";
    }
    @GetMapping("/all")
    public List<Inscription> getallInscriptions(){
        return InscriptionService.getAll();
    }
    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription p)
    {
        return InscriptionService.updateInscription(p);
    }

@PutMapping("/assignSkierInscription/{numskieur}")
    public Inscription addinscritonskieur ( @RequestBody Inscription inscription,@PathVariable("numskieur") Long numskieur )
{
    return InscriptionService.addInscriptionAndAssignToSkier(inscription,numskieur);
}
@PutMapping("/assigninscritocors/{inscriid}/{coursid}")
    public Inscription addinscritocours (@PathVariable Long inscriid,@PathVariable Long coursid)
{
    return InscriptionService.assigninscriptiontocours(inscriid,coursid);
}


}

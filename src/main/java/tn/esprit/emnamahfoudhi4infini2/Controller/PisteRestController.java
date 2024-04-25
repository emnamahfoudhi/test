package tn.esprit.emnamahfoudhi4infini2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.emnamahfoudhi4infini2.Entities.Piste;
import tn.esprit.emnamahfoudhi4infini2.services.IPisteservice;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Piste")

public class PisteRestController {
    private IPisteservice pisteService ;
    @PostMapping("/save")
    public Piste addPiste(@RequestBody Piste piste ){
        return pisteService.addPiste(piste);
    }
    @GetMapping("/findbyid/{idpiste}")
    public Piste findpistebyid(@PathVariable Long idpiste){
        return pisteService.findPisteById(idpiste);
    }

    @DeleteMapping("deletepiste/{idpiste}")
    public String deletePiste(@PathVariable Long idpiste){
        pisteService.deletePiste(idpiste);
        return "piste deleted !";
    }
    @GetMapping("/all")
    public List<Piste> getallpistes(){
        return pisteService.getAll();
    }

    @PutMapping("/updatepiste")
    public Piste updatepiste(@RequestBody Piste p)
    {
        return pisteService.updatePiste(p);
    }

    @PutMapping("/assignskieurtopiste/{skieurid}/{pisteid}")
    public Piste assignskieurtopiste (@PathVariable Long skieurid,@PathVariable Long pisteid)
    {
        return pisteService.assignskieurtopiste(skieurid,pisteid);

    }



}

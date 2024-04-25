package tn.esprit.emnamahfoudhi4infini2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.emnamahfoudhi4infini2.Entities.Cours;

import tn.esprit.emnamahfoudhi4infini2.services.ICoursService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Cours")

public class CousRestController {
    private ICoursService coursservice;

    @PostMapping("/save")
    public Cours addCours(@RequestBody Cours c ){
        return coursservice.addcours(c);
    }
    @GetMapping("/findbyid/{idc}")
    public Cours findcoursbyid(@PathVariable Long idc){
        return coursservice.findCoursById(idc);
    }

    @DeleteMapping("deletecours/{idc}")
    public String deletecours(@PathVariable Long idc){
        coursservice.deleteCours(idc);
        return "Cours deleted !";
    }
    @GetMapping("/all")
    public List<Cours> getallCours(){
        return coursservice.getAll();
    }
    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours c)
    {
        return coursservice.updatecours(c);
    }

}

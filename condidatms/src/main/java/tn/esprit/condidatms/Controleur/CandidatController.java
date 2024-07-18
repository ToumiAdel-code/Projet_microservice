package tn.esprit.condidatms.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.condidatms.Service.CandidatService;
import tn.esprit.condidatms.entity.Candidat;

import java.util.List;

@RestController
@RequestMapping("/candidats")
public class CandidatController {
    @Autowired
    private CandidatService service;

    @GetMapping
    public List<Candidat> getAllCandidats() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Candidat getCandidat(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Candidat createCandidat(@RequestBody Candidat candidat) {
        return service.save(candidat);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidat(@PathVariable Long id) {
        service.delete(id);
    }
}

package tn.esprit.offrems.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.offrems.Service.OffreService;
import tn.esprit.offrems.entity.Offre;

import java.util.List;

@RestController
@RequestMapping("/offres")
public class OffreController {
    @Autowired
    private OffreService service;

    @GetMapping
    public List<Offre> getAllOffres() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Offre getOffre(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Offre createOffre(@RequestBody Offre offre) {
        return service.save(offre);
    }

    @DeleteMapping("/{id}")
    public void deleteOffre(@PathVariable String id) {
        service.delete(id);
    }
}

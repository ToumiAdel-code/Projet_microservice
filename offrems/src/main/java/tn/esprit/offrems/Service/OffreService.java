package tn.esprit.offrems.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.offrems.Repository.OffreRepository;
import tn.esprit.offrems.entity.Offre;

import java.util.List;

@Service
public class OffreService {
    @Autowired
    private OffreRepository repository;

    public List<Offre> findAll() {
        return repository.findAll();
    }

    public Offre save(Offre offre) {
        return repository.save(offre);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Offre findById(String id) {
        return repository.findById(id).orElse(null);
    }
}

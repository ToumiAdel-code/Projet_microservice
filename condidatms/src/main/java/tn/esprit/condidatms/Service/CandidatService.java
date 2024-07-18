package tn.esprit.condidatms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.condidatms.Repository.CandidatRepository;
import tn.esprit.condidatms.client.OffreClient;
import tn.esprit.condidatms.dto.CondidatDto;
import tn.esprit.condidatms.dto.OffreDto;
import tn.esprit.condidatms.entity.Candidat;
import tn.esprit.condidatms.mapper.CondidatMapper;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository repository;
    @Autowired
    private OffreClient offreClient;


    public OffreDto getOffrecondidat(long rdvid) {
        Candidat candidat = repository.findById(rdvid)
                .orElseThrow(() -> new RuntimeException("rdv not found"));

        // Utilisation du mapper pour convertir l'entité RendezVous en RendezVousDto

        // Récupération des informations du patient
        OffreDto offreDto = offreClient.getOffre(candidat.getIdOffre());

        // Ajout des informations du patient au DTO du rendez-vous


        return offreDto;
    }

    public List<Candidat> findAll() {
        return repository.findAll();
    }

    public Candidat save(Candidat candidat) {
        return repository.save(candidat);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Candidat findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}

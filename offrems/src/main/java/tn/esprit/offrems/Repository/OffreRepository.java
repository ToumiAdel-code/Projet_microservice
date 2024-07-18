package tn.esprit.offrems.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.offrems.entity.Offre;

public interface OffreRepository extends MongoRepository<Offre, String> {
}

package tn.esprit.condidatms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.condidatms.entity.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {
}

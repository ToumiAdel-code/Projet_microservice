package tn.esprit.condidatms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.condidatms.dto.OffreDto;

@FeignClient(name = "offres", url = "http://localhost:9091")

public interface OffreClient {

    @GetMapping("/{id}")
    OffreDto getOffre(@PathVariable String id);
}

package tn.esprit.offrems.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.offrems.dto.OffreDto;
import tn.esprit.offrems.entity.Offre;

@Mapper
public interface OffreMapper {

    OffreMapper INSTANCE = Mappers.getMapper(OffreMapper.class);

    OffreDto OffreToOffreDto(Offre candidat);

    Offre OffreDtoToOffre(OffreDto condidatDto);
}

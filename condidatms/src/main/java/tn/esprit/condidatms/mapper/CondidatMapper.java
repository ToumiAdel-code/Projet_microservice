package tn.esprit.condidatms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.condidatms.dto.CondidatDto;
import tn.esprit.condidatms.entity.Candidat;

@Mapper
public interface CondidatMapper {



    CondidatMapper INSTANCE = Mappers.getMapper(CondidatMapper.class);

    CondidatDto CandidatToCandidatDto(Candidat candidat);

    Candidat CandidatDtoToCandidat(CondidatDto condidatDto);
}

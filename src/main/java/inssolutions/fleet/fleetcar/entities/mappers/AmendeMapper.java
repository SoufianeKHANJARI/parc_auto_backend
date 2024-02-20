package inssolutions.fleet.fleetcar.entities.mappers;




import inssolutions.fleet.fleetcar.entities.Amende;
import inssolutions.fleet.fleetcar.entities.dtos.AmendeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AmendeMapper {
    AmendeMapper CAR_MAPPER = Mappers.getMapper(AmendeMapper.class);
    AmendeDto toDto(Amende amende);
    Amende toEntity(AmendeDto amendeDto);
}

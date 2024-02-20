package inssolutions.fleet.fleetcar.entities.mappers;



import inssolutions.fleet.fleetcar.entities.Car;
import inssolutions.fleet.fleetcar.entities.dtos.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarMapper CAR_MAPPER = Mappers.getMapper(CarMapper.class);
    CarDto toDto(Car mission);
    Car toEntity(CarDto missionDto);
}

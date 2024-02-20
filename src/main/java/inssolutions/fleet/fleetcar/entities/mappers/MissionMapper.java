package inssolutions.fleet.fleetcar.entities.mappers;


import inssolutions.fleet.fleetcar.entities.Mission;
import inssolutions.fleet.fleetcar.entities.dtos.MissionDto;
import inssolutions.fleet.fleetcar.entities.dtos.MissionInsertDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MissionMapper {
    MissionMapper MISSION_MAPPER = Mappers.getMapper(MissionMapper.class);
    @Mapping(source = "driverDto",target = "driver")
    @Mapping(source = "carDto",target = "car")
    Mission toEntity(MissionDto missionDto);
    Mission toEntityInsert(MissionInsertDto missionInsertDto);
    @Mapping(source = "driver",target = "driverDto")
    @Mapping(source = "car",target = "carDto")
    MissionDto toDto(Mission mission);
    MissionInsertDto toDtoInsrt(Mission mission);
}

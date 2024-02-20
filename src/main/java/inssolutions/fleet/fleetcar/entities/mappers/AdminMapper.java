package inssolutions.fleet.fleetcar.entities.mappers;


import inssolutions.fleet.fleetcar.entities.Admin;
import inssolutions.fleet.fleetcar.entities.dtos.AdminDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    AdminMapper ADMIN_MAPPER = Mappers.getMapper(AdminMapper.class);
    AdminDto toDto(Admin admin);
    Admin toEntity(AdminDto adminDto);
}

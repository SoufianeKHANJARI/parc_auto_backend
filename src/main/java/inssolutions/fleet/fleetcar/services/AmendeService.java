package inssolutions.fleet.fleetcar.services;



import inssolutions.fleet.fleetcar.entities.dtos.AmendeDto;

import java.util.List;

public interface AmendeService {
    String save(AmendeDto amendeDto);
    AmendeDto amendeFindByid(int id);
    List<AmendeDto> findAllList ();
    String updateAmende(int id, AmendeDto amendeDto);
}

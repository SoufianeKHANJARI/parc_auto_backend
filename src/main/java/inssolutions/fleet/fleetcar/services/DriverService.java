package inssolutions.fleet.fleetcar.services;



import inssolutions.fleet.fleetcar.entities.dtos.DriverDto;

import java.util.List;

public interface DriverService {
    String save(DriverDto driverDto);
    DriverDto driverFindByid(int id);
    List<DriverDto> findAllList ();
    String updateDriver(int id, DriverDto driverDto);
}

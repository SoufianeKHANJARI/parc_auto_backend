package inssolutions.fleet.fleetcar.controllers;


import inssolutions.fleet.fleetcar.controllers.api.DriverApi;
import inssolutions.fleet.fleetcar.entities.dtos.DriverDto;
import inssolutions.fleet.fleetcar.services.DriverService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController implements DriverApi {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @Override
    public String save(DriverDto driverDto) {
        return driverService.save(driverDto);
    }

    @Override
    public DriverDto driverFindByid(int id) {
        return driverService.driverFindByid(id);
    }

    @Override
    public List<DriverDto> findAllList() {
        return driverService.findAllList();
    }

    @Override
    public String updateDriver(int id, DriverDto driverDto) {
        return driverService.updateDriver(id,driverDto);
    }
}

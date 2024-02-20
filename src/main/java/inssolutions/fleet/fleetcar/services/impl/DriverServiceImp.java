package inssolutions.fleet.fleetcar.services.impl;


import inssolutions.fleet.fleetcar.entities.Driver;
import inssolutions.fleet.fleetcar.entities.dtos.DriverDto;
import inssolutions.fleet.fleetcar.entities.mappers.DriverMapper;
import inssolutions.fleet.fleetcar.repositories.DriverRepository;
import inssolutions.fleet.fleetcar.services.DriverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DriverServiceImp implements DriverService {
    private DriverRepository driverRepository;
    private DriverMapper driverMapper;

    public DriverServiceImp(DriverRepository driverRepository, DriverMapper driverMapper) {
        this.driverRepository = driverRepository;
        this.driverMapper = driverMapper;
    }

    // mapper Driver
    Driver getEntity(DriverDto driverDto){
        return  driverMapper.toEntity(driverDto);
    }
    DriverDto getDto(Driver driver){
        return driverMapper.toDto(driver);
    }


    @Override
    public String save(DriverDto driverDto) {
         driverRepository.save(getEntity(driverDto));
         return "Driver add successfully";
    }

    @Override
    public DriverDto driverFindByid(int id) {
        return getDto(driverRepository.findById(id).get());
    }

    @Override
    public List<DriverDto> findAllList() {
        return driverRepository.findAll().stream()
                .map(
                        (driver)->
                            getDto(driver)

                ).toList();
    }

    @Override
    public String updateDriver(int id, DriverDto driverDto) {
        if (driverRepository.existsById(id)) {
            driverRepository.save(getEntity(driverDto));
            return "Driver update successfully";
        } else {
            return "Driver update faillure";
        }
    }
}

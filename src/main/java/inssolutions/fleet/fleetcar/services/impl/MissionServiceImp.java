package inssolutions.fleet.fleetcar.services.impl;


import inssolutions.fleet.fleetcar.entities.Car;
import inssolutions.fleet.fleetcar.entities.Driver;
import inssolutions.fleet.fleetcar.entities.Mission;
import inssolutions.fleet.fleetcar.entities.dtos.CarDto;
import inssolutions.fleet.fleetcar.entities.dtos.DriverDto;
import inssolutions.fleet.fleetcar.entities.dtos.MissionDto;
import inssolutions.fleet.fleetcar.entities.dtos.MissionInsertDto;
import inssolutions.fleet.fleetcar.entities.mappers.CarMapper;
import inssolutions.fleet.fleetcar.entities.mappers.DriverMapper;
import inssolutions.fleet.fleetcar.entities.mappers.MissionMapper;
import inssolutions.fleet.fleetcar.repositories.CarRepository;
import inssolutions.fleet.fleetcar.repositories.DriverRepository;
import inssolutions.fleet.fleetcar.repositories.MissionRepository;
import inssolutions.fleet.fleetcar.services.MissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MissionServiceImp implements MissionService {
    private MissionRepository missionRepository;
    private DriverRepository driverRepository;
    private CarRepository carRepository;
    private MissionMapper missionMapper;
    private DriverMapper driverMapper;
    private CarMapper carMapper;

    public MissionServiceImp(MissionRepository missionRepository, DriverRepository driverRepository, CarRepository carRepository, MissionMapper missionMapper, DriverMapper driverMapper, CarMapper carMapper) {
        this.missionRepository = missionRepository;
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.missionMapper = missionMapper;
        this.driverMapper = driverMapper;
        this.carMapper = carMapper;
    }

    // mapper Mission
    Mission getEntity(MissionDto missionDto){
        return  missionMapper.toEntity(missionDto);
    }
    MissionDto getDto(Mission mission){
        return missionMapper.toDto(mission);
    }
    Driver getEntityDriver(DriverDto driverDto){
        return  driverMapper.toEntity(driverDto);
    }
    DriverDto getDtoDriver(Driver driver){
        return driverMapper.toDto(driver);
    }
    Car getEntityCar(CarDto carDto){
        return  carMapper.toEntity(carDto);
    }
    CarDto getDtoCar(Car car){
        return carMapper.toDto(car);
    }

    @Override
    public String save(MissionInsertDto missionInsertDto) {
        MissionDto missionDto =new MissionDto();
        BeanUtils.copyProperties(missionInsertDto,missionDto);
        Driver driver =driverRepository.findById(missionInsertDto.getDriverID()).get();
        Car car =carRepository.findById(missionInsertDto.getCarID()).get();
        missionDto.setDriverDto(getDtoDriver(driver));
        missionDto.setCarDto(getDtoCar(car));
         missionRepository.save(getEntity(missionDto));
         return "Mission add successfully";
    }

    @Override
    public MissionDto missionFindByid(int id) {
        return getDto(missionRepository.findById(id).get());
    }

    @Override
    public List<MissionDto> findAllList() {
        return missionRepository.findAll().stream()
                .map(
                        (mission)->
                            getDto(mission)

                ).toList();
    }

    @Override
    public String updateMission(int id, MissionDto missionDto) {
        if (missionRepository.existsById(id)) {
            missionRepository.save(getEntity(missionDto));
            return "Mission update successfully";
        } else {
            return "Mission update faillure";
        }
    }
}

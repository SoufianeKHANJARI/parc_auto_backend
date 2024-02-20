package inssolutions.fleet.fleetcar.services.impl;


import inssolutions.fleet.fleetcar.entities.Car;
import inssolutions.fleet.fleetcar.entities.dtos.CarDto;
import inssolutions.fleet.fleetcar.entities.mappers.CarMapper;
import inssolutions.fleet.fleetcar.repositories.CarRepository;
import inssolutions.fleet.fleetcar.services.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CarServiceImp implements CarService {
    private CarRepository carRepository;
    private CarMapper carMapper;

    public CarServiceImp(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    // mapper Car
    Car getEntity(CarDto carDto){
        return  carMapper.toEntity(carDto);
    }
    CarDto getDto(Car car){
        return carMapper.toDto(car);
    }


    @Override
    public String save(CarDto carDto) {
         carRepository.save(getEntity(carDto));
         return "Car add successfully";
    }

    @Override
    public CarDto carFindByid(int id) {
        return getDto(carRepository.findById(id).get());
    }

    @Override
    public List<CarDto> findAllList() {
        return carRepository.findAll().stream()
                .map(
                        (car)->
                            getDto(car)

                ).toList();
    }

    @Override
    public String updateCar(int id, CarDto carDto) {
        if (carRepository.existsById(id)) {
            carRepository.save(getEntity(carDto));
            return "Car update successfully";
        } else {
            return "Car update faillure";
        }
    }
}

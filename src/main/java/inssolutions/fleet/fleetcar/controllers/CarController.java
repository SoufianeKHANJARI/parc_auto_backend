package inssolutions.fleet.fleetcar.controllers;


import inssolutions.fleet.fleetcar.controllers.api.CarApi;
import inssolutions.fleet.fleetcar.entities.dtos.CarDto;
import inssolutions.fleet.fleetcar.services.CarService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CarController implements CarApi {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @Override
    public String save(CarDto carDto) {
        return carService.save(carDto);
    }

    @Override
    public CarDto carFindByid(int id) {

        return carService.carFindByid(id);
    }

    @Override
    public List<CarDto> findAllList() {

        return carService.findAllList();
    }

    @Override
    public String updateCar(int id, CarDto carDto) {

        return carService.updateCar(id,carDto);
    }
}

package inssolutions.fleet.fleetcar.services;



import inssolutions.fleet.fleetcar.entities.dtos.CarDto;

import java.util.List;

public interface CarService {
    String save(CarDto carDto);
    CarDto carFindByid(int id);
    List<CarDto> findAllList ();
    String updateCar(int id, CarDto carDto);
}

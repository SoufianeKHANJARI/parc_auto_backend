package inssolutions.fleet.fleetcar.controllers.api;

import inssolutions.fleet.fleetcar.entities.dtos.CarDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("car")
@CrossOrigin(origins = "http://localhost:4200/")
public interface CarApi {
    @PostMapping()
    String save(@RequestBody CarDto carDto);
    @GetMapping("/{id}")
    CarDto carFindByid(@PathVariable int id);
    @GetMapping()
    List<CarDto> findAllList ();
    @PutMapping("/{id}")
    String updateCar(@PathVariable int id, @RequestBody CarDto carDto);
}

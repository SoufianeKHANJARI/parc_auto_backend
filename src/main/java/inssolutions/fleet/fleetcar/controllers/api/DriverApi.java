package inssolutions.fleet.fleetcar.controllers.api;

import inssolutions.fleet.fleetcar.entities.dtos.DriverDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("driver")
@CrossOrigin(origins = "http://localhost:4200/")
public interface DriverApi {
    @PostMapping()
    String save(@RequestBody DriverDto driverDto);
    @GetMapping("/{id}")
    DriverDto driverFindByid(@PathVariable int id);
    @GetMapping()
    List<DriverDto> findAllList ();
    @PutMapping("/{id}")
    String updateDriver(@PathVariable int id, @RequestBody DriverDto driverDto);
}

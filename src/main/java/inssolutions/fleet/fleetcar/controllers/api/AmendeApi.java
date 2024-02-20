package inssolutions.fleet.fleetcar.controllers.api;

import inssolutions.fleet.fleetcar.entities.dtos.AmendeDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("amende")
@CrossOrigin(origins = "http://localhost:4200/")
public interface AmendeApi {
    @PostMapping()
    String save(@RequestBody AmendeDto amendeDto);
    @GetMapping("/{id}")
    AmendeDto amendeFindByid(@PathVariable int id);
    @GetMapping()
    List<AmendeDto> findAllList ();
    @PutMapping("/{id}")
    String updateAmende(@PathVariable int id, @RequestBody AmendeDto amendeDto);
}

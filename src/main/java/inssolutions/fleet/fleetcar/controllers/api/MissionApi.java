package inssolutions.fleet.fleetcar.controllers.api;


import inssolutions.fleet.fleetcar.entities.dtos.MissionDto;
import inssolutions.fleet.fleetcar.entities.dtos.MissionInsertDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("mission")
@CrossOrigin(origins = "http://localhost:4200/")
public interface MissionApi {
    @PostMapping()
    String save(@RequestBody MissionInsertDto missionInsertDto);
    @GetMapping("/{id}")
    MissionDto missionFindByid(@PathVariable int id);
    @GetMapping()
    List<MissionDto> findAllList ();
    @PutMapping("/{id}")
    String updateMission(@PathVariable int id, @RequestBody MissionDto missionDto);
}

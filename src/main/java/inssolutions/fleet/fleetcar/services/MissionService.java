package inssolutions.fleet.fleetcar.services;


import inssolutions.fleet.fleetcar.entities.dtos.MissionDto;
import inssolutions.fleet.fleetcar.entities.dtos.MissionInsertDto;

import java.util.List;

public interface MissionService {
    String save(MissionInsertDto missionInsertDto);
    MissionDto missionFindByid(int id);
    List<MissionDto> findAllList ();
    String updateMission(int id, MissionDto missionDto);
}

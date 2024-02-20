package inssolutions.fleet.fleetcar.controllers;


import inssolutions.fleet.fleetcar.controllers.api.AmendeApi;
import inssolutions.fleet.fleetcar.entities.dtos.AmendeDto;
import inssolutions.fleet.fleetcar.services.AmendeService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AmendeController implements AmendeApi {
    private final AmendeService amendeService;

    public AmendeController(AmendeService amendeService) {
        this.amendeService = amendeService;
    }

    @Override
    public String save(AmendeDto amendeDto) {
        return amendeService.save(amendeDto);
    }

    @Override
    public AmendeDto amendeFindByid(int id) {
        return amendeService.amendeFindByid(id);
    }

    @Override
    public List<AmendeDto> findAllList() {
        return amendeService.findAllList();
    }

    @Override
    public String updateAmende(int id, AmendeDto amendeDto) {
        return amendeService.updateAmende(id,amendeDto);
    }
}

package inssolutions.fleet.fleetcar.services.impl;


import inssolutions.fleet.fleetcar.entities.Amende;
import inssolutions.fleet.fleetcar.entities.dtos.AmendeDto;
import inssolutions.fleet.fleetcar.entities.mappers.AmendeMapper;
import inssolutions.fleet.fleetcar.repositories.AmendeRepository;
import inssolutions.fleet.fleetcar.services.AmendeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AmendeServiceImp implements AmendeService {
    private AmendeRepository amendeRepository;
    private AmendeMapper amendeMapper;

    public AmendeServiceImp(AmendeRepository amendeRepository, AmendeMapper amendeMapper) {
        this.amendeRepository = amendeRepository;
        this.amendeMapper = amendeMapper;
    }

    // mapper Amende
    Amende getEntity(AmendeDto amendeDto){
        return  amendeMapper.toEntity(amendeDto);
    }
    AmendeDto getDto(Amende amende){
        return amendeMapper.toDto(amende);
    }


    @Override
    public String save(AmendeDto amendeDto) {
         amendeRepository.save(getEntity(amendeDto));
         return "Amende add successfully";
    }

    @Override
    public AmendeDto amendeFindByid(int id) {
        return getDto(amendeRepository.findById(id).get());
    }

    @Override
    public List<AmendeDto> findAllList() {
        return amendeRepository.findAll().stream()
                .map(
                        (amende)->
                            getDto(amende)

                ).toList();
    }

    @Override
    public String updateAmende(int id, AmendeDto amendeDto) {
        if (amendeRepository.existsById(id)) {
            amendeRepository.save(getEntity(amendeDto));
            return "Amende update successfully";
        } else {
            return "Amende update faillure";
        }
    }
}

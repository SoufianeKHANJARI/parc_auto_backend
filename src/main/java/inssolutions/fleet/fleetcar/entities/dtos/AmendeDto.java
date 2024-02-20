package inssolutions.fleet.fleetcar.entities.dtos;

import inssolutions.fleet.fleetcar.entities.Categorie_Amende;
import inssolutions.fleet.fleetcar.entities.Mission;
import inssolutions.fleet.fleetcar.entities.Parc;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmendeDto {
     int idAmende;
     LocalDate dateRecuAmende;
     int frais;
     LocalDate DateDeFAitAmende ;
     LocalDate DatePayement ;
     Boolean IsContested;
     Boolean IsPayed;
     String Motif;
     String Emplacement ;

    private int parc_id;
    private int mission_id;

}

package inssolutions.fleet.fleetcar.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionInsertDto {
    private int id;
    private int driverID;
    private int carID;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String status;
    private LocalDate created_at;
    private int start_km;
    private int end_km;
    private String start_state;
    private String end_state;
    private String driver_License;
    private boolean is_delete;
    private int parc_id;
}

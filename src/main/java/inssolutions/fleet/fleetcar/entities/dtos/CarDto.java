package inssolutions.fleet.fleetcar.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarDto {
    private int id;
    private String brand;
    private String mat;
    private String fuel;
    private LocalDate circulationDate;
    private String power;
    private String model;
    private Integer nbrPlace;
    private String description;
    private String couleur;
    private boolean isDelete;
    private String photoVoiture;
    private int parc_id;
}

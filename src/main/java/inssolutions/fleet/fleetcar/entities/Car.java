package inssolutions.fleet.fleetcar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Car extends CommunEntity {
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
    @ManyToOne
    @JoinColumn(name = "parc_id")
    private Parc parc;


}

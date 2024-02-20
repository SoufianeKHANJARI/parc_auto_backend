package inssolutions.fleet.fleetcar.entities;

import jakarta.persistence.*;
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
public class Mission extends CommunEntity{
    @ManyToOne
    private Car car;
    @ManyToOne
    private Driver driver;
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
    @ManyToOne
    @JoinColumn(name = "parc_id")
    private Parc parc;

}

package inssolutions.fleet.fleetcar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Carburant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCarburant ;
    private LocalDate dateCarburant ;
    private int frais ;
    private int Kilometrage ;
    private int Quantite ;
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission ;
    @ManyToOne
    @JoinColumn(name = "parc_id")
    private Parc parc ;
}

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
public class Amende {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAmende;
    private LocalDate dateRecuAmende;
    private int frais;
    private LocalDate DateDeFAitAmende ;
    private LocalDate DatePayement ;
    private Boolean IsContested;
    private Boolean IsPayed;
    private String Motif;
    private String Emplacement ;
    @ManyToOne
    @JoinColumn(name = "parc_id")
    private Parc parc ;
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;
    @ManyToOne
    @JoinColumn(name = "categorieAmende_id")
    private Categorie_Amende categorieAmende ;
}

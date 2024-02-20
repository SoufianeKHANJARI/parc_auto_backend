package inssolutions.fleet.fleetcar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Categorie_Amende {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCategorie ;
    private String TypeAmende ;
}

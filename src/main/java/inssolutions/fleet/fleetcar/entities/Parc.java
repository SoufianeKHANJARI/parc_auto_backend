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
public class Parc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idParc ;
    private String corporateName ;
    private String phone ;
    private String address;
    private String mail;
    private String logo;
    private Boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;
}

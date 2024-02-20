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
public class ResponsableParc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idResParc;
    private String login;
    private String motDEpasse;
    private String nom;
    private String prenom;
    private String mail;
    private String telephone;
    private String adresse;
    private Boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "parc_id")
    private Parc parc;
}

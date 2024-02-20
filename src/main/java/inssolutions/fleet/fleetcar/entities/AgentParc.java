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
public class AgentParc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAgent;
    private String login ;
    private String motDEpasse ;
    private String nom ;
    private String prenom ;
    private String mail ;
    private String telephone;
    private String adresse;
    private Boolean isDelete ;
    @ManyToOne
    @JoinColumn(name = "parc_id")
    private Parc parc;
}

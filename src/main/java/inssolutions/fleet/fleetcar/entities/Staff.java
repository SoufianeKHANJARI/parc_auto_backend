package inssolutions.fleet.fleetcar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mail;
    private String phone;
    private String address;
    private String info;
    private String state;
    private String login;
    private String password;
    @ManyToOne
    @JoinColumn(name = "parc_id")
    private Parc parc;
}

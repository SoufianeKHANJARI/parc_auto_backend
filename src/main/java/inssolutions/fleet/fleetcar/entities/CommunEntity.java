package inssolutions.fleet.fleetcar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommunEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

}

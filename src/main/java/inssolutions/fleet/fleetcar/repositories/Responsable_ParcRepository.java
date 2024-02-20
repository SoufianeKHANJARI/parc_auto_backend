package inssolutions.fleet.fleetcar.repositories;


import inssolutions.fleet.fleetcar.entities.ResponsableParc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Responsable_ParcRepository extends JpaRepository<ResponsableParc,Integer> {
}

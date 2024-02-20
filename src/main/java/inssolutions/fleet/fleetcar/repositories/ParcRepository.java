package inssolutions.fleet.fleetcar.repositories;


import inssolutions.fleet.fleetcar.entities.Parc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcRepository extends JpaRepository<Parc,Integer> {
}

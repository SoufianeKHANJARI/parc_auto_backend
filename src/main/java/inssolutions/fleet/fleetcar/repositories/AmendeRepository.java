package inssolutions.fleet.fleetcar.repositories;


import inssolutions.fleet.fleetcar.entities.Amende;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmendeRepository extends JpaRepository<Amende,Integer> {
}

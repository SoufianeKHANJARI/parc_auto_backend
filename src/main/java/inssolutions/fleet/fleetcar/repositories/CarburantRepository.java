package inssolutions.fleet.fleetcar.repositories;


import inssolutions.fleet.fleetcar.entities.Carburant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarburantRepository extends JpaRepository<Carburant,Integer> {
}

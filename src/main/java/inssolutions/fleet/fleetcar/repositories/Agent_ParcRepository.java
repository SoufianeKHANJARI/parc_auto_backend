package inssolutions.fleet.fleetcar.repositories;


import inssolutions.fleet.fleetcar.entities.AgentParc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Agent_ParcRepository extends JpaRepository<AgentParc,Integer> {
}

package inssolutions.fleet.fleetcar.repositories;


import inssolutions.fleet.fleetcar.entities.Categorie_Amende;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categorie_AmendeRepository extends JpaRepository<Categorie_Amende,Integer> {
}

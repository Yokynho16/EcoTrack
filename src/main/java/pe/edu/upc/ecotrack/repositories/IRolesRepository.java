package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Roles;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Integer> {
}

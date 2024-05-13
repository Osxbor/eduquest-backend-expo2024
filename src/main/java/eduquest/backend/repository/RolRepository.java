package eduquest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eduquest.backend.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
}

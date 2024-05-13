package eduquest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eduquest.backend.model.Seccion;

@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Integer>{

}

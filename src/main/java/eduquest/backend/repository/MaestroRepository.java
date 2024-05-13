package eduquest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eduquest.backend.model.Maestro;

@Repository
public interface MaestroRepository extends JpaRepository<Maestro, Integer> {

}

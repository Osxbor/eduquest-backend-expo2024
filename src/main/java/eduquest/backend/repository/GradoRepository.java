package eduquest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eduquest.backend.model.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Integer>{


}

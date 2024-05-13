package eduquest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eduquest.backend.model.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer>{
}

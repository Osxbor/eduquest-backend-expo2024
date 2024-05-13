package eduquest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eduquest.backend.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}

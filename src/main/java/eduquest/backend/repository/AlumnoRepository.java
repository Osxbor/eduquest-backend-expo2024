package eduquest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import eduquest.backend.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}

package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String nombreCurso;
    private String descripcionCurso;

    @ManyToOne
    @JoinColumn(name = "id_grado")
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "id_maestro")
    private Maestro maestro;
}

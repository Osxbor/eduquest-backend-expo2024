package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Examenes")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreExamen;
    private String descripcion;
    private int totalPreguntas;
    private int totalPuntos;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

}

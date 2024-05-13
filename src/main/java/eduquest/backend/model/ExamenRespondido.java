package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ExamenesRespondidos")
public class ExamenRespondido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_examen")
    private Examen examen;

    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;

    private int respuestasCorrectas;
    private int respuestasIncorrectas;
    private int punteoTotal;
}

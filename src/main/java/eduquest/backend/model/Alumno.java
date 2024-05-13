package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;

    private String nombres;
    private String apellidos;
    private String codigoCarne;

    @ManyToOne
    @JoinColumn(name = "id_grado    ")
    private Grado grado;

}

package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Maestros")
public class Maestro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Usuario usuario;

    private String nombres;
    private String apellidos;
    private String telefono;

}

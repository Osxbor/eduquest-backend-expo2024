package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Grados")
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreGrado;

    @ManyToOne
    @JoinColumn(name = "id_seccion")
    private Seccion seccion;
}

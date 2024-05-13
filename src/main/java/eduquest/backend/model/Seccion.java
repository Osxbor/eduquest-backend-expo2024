package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Secciones")
public class Seccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String letraSeccion;

}

package eduquest.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String contraseña;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

}

package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "veterinario")

public class Veterinarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int veterinarioid;

    @Column(name = "nombre", nullable = false)
    private String nombreVeterinario;

    @Column(name = "correo", nullable = false)
    private String correoVeterinario;

    @Column(name = "sede_id", nullable = false)
    private String sedeid;





}

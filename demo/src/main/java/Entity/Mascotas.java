package Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "veterinaria_db")
public class Mascotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int mascotaid;


    @Column(name = "nombre", nullable = false)
    private String nombreMacosta;

    @Column(name = "edad", nullable = false)
    private String edadMascota;

    @Column(name = "genero", nullable = false)
    private String generoMascota;

    @Column(name = "diagnostico", nullable = false)
    private String diagnosticoMascota;

    @Column(name = "fecha_cita", nullable = false)
    private String fechaCita;

    @Column(name = "numero_consultorio", nullable = false)
    private String numeroConsultorio;

    @Column(name = "veterinario_id", nullable = false)
    private String veterinarioid;

    @Column(name = "sede_id", nullable = false)
    private String sedeid;

    public int getMascotaid() {
        return mascotaid;
    }

    public void setMascotaid(int mascotaid) {
        this.mascotaid = mascotaid;
    }

    public String getNombreMacosta() {
        return nombreMacosta;
    }

    public void setNombreMacosta(String nombreMacosta) {
        this.nombreMacosta = nombreMacosta;
    }

    public String getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(String edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getGeneroMascota() {
        return generoMascota;
    }

    public void setGeneroMascota(String generoMascota) {
        this.generoMascota = generoMascota;
    }

    public String getDiagnosticoMascota() {
        return diagnosticoMascota;
    }

    public void setDiagnosticoMascota(String diagnosticoMascota) {
        this.diagnosticoMascota = diagnosticoMascota;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getVeterinarioid() {
        return veterinarioid;
    }

    public void setVeterinarioid(String veterinarioid) {
        this.veterinarioid = veterinarioid;
    }

    public String getSedeid() {
        return sedeid;
    }

    public void setSedeid(String sedeid) {
        this.sedeid = sedeid;
    }
}

package Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "sede")

public class Sedes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int sedeid;

    @Column(name = "nombre", nullable = false)
    private String nombreSede;

    @Column(name = "direccion", nullable = false)
    private String direccionSede;

    @Column(name = "telefono", nullable = false)
    private String telefonoSede;

    public int getSedeid() {
        return sedeid;
    }

    public void setSedeid(int sedeid) {
        this.sedeid = sedeid;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public String getTelefonoSede() {
        return telefonoSede;
    }

    public void setTelefonoSede(String telefonoSede) {
        this.telefonoSede = telefonoSede;
    }
}

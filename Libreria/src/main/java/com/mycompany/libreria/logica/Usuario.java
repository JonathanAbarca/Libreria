
package com.mycompany.libreria.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jonathan Abarca
 */
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_User;
    @Basic
    private String rut;    
    private String nombre;
    private String correo;
    private String direccion;
    private String telefono;
    private String fecha_Ingreso;

    public Usuario() {
    }

    public Usuario(int id_User, String rut, String nombre, String correo, String direccion, String telefono, String fecha_Ingreso) {
        this.id_User = id_User;
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(String fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }
    
    
    
}

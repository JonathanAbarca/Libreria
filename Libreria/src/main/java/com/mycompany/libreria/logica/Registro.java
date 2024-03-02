/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jonathan Abarca
 */
@Entity
public class Registro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Registro;
    @Basic
    private String fecha_Devuelto;
    
    @ManyToOne
    @JoinColumn(name = "id_Book") // nombre de la columna en la tabla de Hijo que hace referencia a Padre
    private Book id_Book;
    
    @ManyToOne
    @JoinColumn(name = "id_User") // nombre de la columna en la tabla de Hijo que hace referencia a Padre
    private Usuario Id_User;

    public Registro() {
    }

    public Registro(int id_Registro, String fecha_Devuelto, Book id_Book, Usuario Id_User) {
        this.id_Registro = id_Registro;
        this.fecha_Devuelto = fecha_Devuelto;
        this.id_Book = id_Book;
        this.Id_User = Id_User;
    }

    public int getId_Registro() {
        return id_Registro;
    }

    public void setId_Registro(int id_Registro) {
        this.id_Registro = id_Registro;
    }

    public String getFecha_Devuelto() {
        return fecha_Devuelto;
    }

    public void setFecha_Devuelto(String fecha_Devuelto) {
        this.fecha_Devuelto = fecha_Devuelto;
    }

    public Book getId_Book() {
        return id_Book;
    }

    public void setId_Book(Book id_Book) {
        this.id_Book = id_Book;
    }

    public Usuario getId_User() {
        return Id_User;
    }

    public void setId_User(Usuario Id_User) {
        this.Id_User = Id_User;
    }
    
    
    
}


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
public class Prestamos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Prestamo;
    @Basic
    private String fecha_Prestamo;
    
    
    @ManyToOne
    @JoinColumn(name = "Id_User")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_Book")
    private Book book;

    public Prestamos() {
    }

    public Prestamos(int id_Prestamo, String fecha_Prestamo, int id_Book, int Id_User, Usuario usuario, Book book) {
        this.id_Prestamo = id_Prestamo;
        this.fecha_Prestamo = fecha_Prestamo;
        //this.id_Book = id_Book;
        //this.Id_User = Id_User;
        this.usuario = usuario;
        this.book = book;
    }

    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    public int getId_Prestamo() {
        return id_Prestamo;
    }

    public void setId_Prestamo(int id_Prestamo) {
        this.id_Prestamo = id_Prestamo;
    }

    public String getFecha_Prestamo() {
        return fecha_Prestamo;
    }

    public void setFecha_Prestamo(String fecha_Prestamo) {
        this.fecha_Prestamo = fecha_Prestamo;
    }

   /*public int getId_Book() {
        return id_Book;
    }

    public void setId_Book(int id_Book) {
        this.id_Book = id_Book;
    }

    public int getId_User() {
        return Id_User;
    }

    public void setId_User(int Id_User) {
        this.Id_User = Id_User;
    }*/
    
    
    
    
}

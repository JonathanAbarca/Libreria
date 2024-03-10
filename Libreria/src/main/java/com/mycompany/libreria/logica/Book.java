
package com.mycompany.libreria.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author Jonathan Abarca
 */
@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)     
    private int id_Book;
    @Basic
    private String titulo;
    private String autor;
    private String editorial; 
    private String fechaIngreso;
    private int disponible;
    
    @OneToMany(mappedBy = "book")
    private List<Prestamos> prestamos;
    
    
    public Book() {
    }

    public Book(int id_Book, String titulo, String autor, String editorial, String fechaIngreso, int disponible, List<Prestamos> prestamos) {
        this.id_Book = id_Book;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaIngreso = fechaIngreso;
        this.disponible = disponible;
        this.prestamos = prestamos;
    }

    

    public List<Prestamos> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamos> prestamos) {
        this.prestamos = prestamos;
    }
    
    public int getId_Book() {
        return id_Book;
    }

    public void setId_Book(int id_Book) {
        this.id_Book = id_Book;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
    
    

}

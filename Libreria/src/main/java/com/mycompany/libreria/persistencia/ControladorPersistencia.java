
package com.mycompany.libreria.persistencia;


import com.mycompany.libreria.logica.Book;
import com.mycompany.libreria.logica.Prestamos;
import com.mycompany.libreria.logica.Usuario;
import com.mycompany.libreria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan Abarca
 */
public class ControladorPersistencia {   
    UsuarioJpaController miUsuarioJpaController = new UsuarioJpaController();
    BookJpaController miBookJpaController = new BookJpaController();
    PrestamosJpaController miPrestamosJpaController = new PrestamosJpaController();
    
    public void guardarUsuario(Usuario miUsuario, String rut, String nombre, String direccion, String telefono, String correo, String fechaRegistro) {
        
        miUsuarioJpaController.create(miUsuario);
    }

    public void guardarLibro(Book miBook, String titulo, String autor, String editorial, String miFecha, int disponible) {
        
        miBookJpaController.create(miBook);        
    }
    
    public void editarLibro(Book miBook) {
        try {
                   
            miBookJpaController.edit(miBook);            
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Book> traerLibros() {
        
        return miBookJpaController.findBookEntities();
    }

    public Book cargarParaModificar(int idModificar) {
        
        return miBookJpaController.findBook(idModificar);
    }

    public List<Usuario> traerUsuarios() {
        return miUsuarioJpaController.findUsuarioEntities();
    }

    public void modificarUsuario(Usuario miUsuario) {
        try {
            miUsuarioJpaController.edit(miUsuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario cargarParaModUsuario(int idUsu) {
        return miUsuarioJpaController.findUsuario(idUsu);
    }

    public void eliminarLibro(int idBorrar) {
        try {
            miBookJpaController.destroy(idBorrar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarUsuario(int idUsuario) {
        try {
            miUsuarioJpaController.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Usuario> buscarUsuarioRut(String rut){        
        return miUsuarioJpaController.buscarUsuarioRut(rut);    
    }

    public List<Book> buscarLibro(String nombre) {
       return miBookJpaController.buscarLibroNombre(nombre);
    }

    public void reservarLibro(Prestamos miPrestamos, int libro, int usuario, String fecha) {
        miPrestamos.setId_Book(libro);
        miPrestamos.setId_User(usuario);
        miPrestamos.setFecha_Prestamo(fecha);
        System.out.println(" " + libro +" "+ usuario +" "+ fecha);
        miPrestamosJpaController.create(miPrestamos);
    }
    
    public List<Prestamos> buscarPrestamos(){ 
        return miPrestamosJpaController.buscarPrestamos();
    }
    
}

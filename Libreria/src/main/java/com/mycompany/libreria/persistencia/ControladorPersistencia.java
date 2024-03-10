
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

    
    public void reservarLibro(int idLibro, int idUsuario, String fecha) {
        // Crear objetos Book y Usuario
        Book book = new Book();
        book.setId_Book(idLibro); // Configurar el ID del libro

        Usuario usuario = new Usuario();
        usuario.setId_User(idUsuario); // Configurar el ID del usuario

        // Crear objeto Prestamos y configurar los valores
        Prestamos miPrestamos = new Prestamos();
        miPrestamos.setBook(book); // Asociar el objeto Book con el Prestamos
        miPrestamos.setUsuario(usuario); // Asociar el objeto Usuario con el Prestamos
        miPrestamos.setFecha_Prestamo(fecha); // Configurar la fecha de préstamo

        // Llamar al método create en el controlador de persistencia
        miPrestamosJpaController.create(miPrestamos);
    }
    
    public List<Prestamos> buscarPrestamos(){ 
        return miPrestamosJpaController.buscarPrestamos();
    }

    public Usuario buscarUsuarioId(int idUsuario) {
                
        return miUsuarioJpaController.findUsuario(idUsuario);
    }

    public Book buscarLibroId(int idBook) {
        return miBookJpaController.findBook(idBook);
    }

    public void cambiarDispo(int id_libro) {
        miBookJpaController.cambiarDispo(id_libro);
    }

    public List<Prestamos> buscarPrestamos(String rutUsu) {
        return miPrestamosJpaController.buscarPrestamos(rutUsu);
    }

    public Book buscarLibroReservado() {
        return miBookJpaController.buscarLibroReservado();
    }

}


package com.mycompany.libreria.logica;

import com.mycompany.libreria.IGU.GestionUsuarios;
import com.mycompany.libreria.persistencia.ControladorPersistencia;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jonathan Abarca
 */
public class Controlador {
    Usuario miUsuario = null;    
    LocalDate fecha = null;
    ControladorPersistencia miControlPersis = new ControladorPersistencia();

    public void guardarUsuario(String rut, String nombre, String direccion, String telefono, String correo) {
        Usuario miUsuario = new Usuario();
        
        miUsuario.setRut(rut);
        miUsuario.setNombre(nombre);
        miUsuario.setDireccion(direccion);
        miUsuario.setTelefono(telefono);
        miUsuario.setCorreo(correo);
        
        fecha = LocalDate.now();
        String fechaHoy = fecha.toString();
        miUsuario.setFecha_Ingreso(fechaHoy);
        
        miControlPersis.guardarUsuario(miUsuario,rut,nombre,direccion,telefono,correo,fechaHoy);
                
    }

    public List<Book> traerLibros() {
        return miControlPersis.traerLibros();
    }

    public Book cargarParaModificar(int idModificar) {
        return miControlPersis.cargarParaModificar(idModificar);
    }
    
    public void modificarLibro(Book miBook,String titulo, String autor, String editorial, String miFecha, int disponible) {
        
        miBook.setTitulo(titulo);
        miBook.setAutor(autor);
        miBook.setEditorial(editorial);
        miBook.setFechaIngreso(miFecha);
        miBook.setDisponible(disponible);        
        miControlPersis.editarLibro(miBook);
        
    }
    
    public void guardarLibro(String titulo, String autor, String editorial, String miFecha, int disponible) {        
        Book miBook = new Book();
        
        miBook.setTitulo(titulo);
        miBook.setAutor(autor);
        miBook.setEditorial(editorial);
        miBook.setFechaIngreso(miFecha);
        miBook.setDisponible(disponible);
        
        miControlPersis.guardarLibro(miBook, titulo, autor, editorial, miFecha, disponible);
    }

    public List<Usuario> traerUsuario() {
        
        return miControlPersis.traerUsuarios();
        
    }

    public void modificarUsuario(Usuario miUsuario, String rut, String nombre, String direccion, String telefono, String correo) {
        miUsuario.setRut(rut);
        miUsuario.setNombre(nombre);
        miUsuario.setDireccion(direccion);
        miUsuario.setTelefono(telefono);
        miUsuario.setCorreo(correo);
        miControlPersis.modificarUsuario(miUsuario);
    }

    public Usuario cargarParaModUsuario(int idUsuario) {
        return miControlPersis.cargarParaModUsuario(idUsuario);
        
    }

    public void eliminarLibro(int idBorrar) {
        miControlPersis.eliminarLibro(idBorrar);
    }

    public void eliminarUsuario(int idUsuario) {
        miControlPersis.eliminarUsuario(idUsuario);
    }
   
    
}

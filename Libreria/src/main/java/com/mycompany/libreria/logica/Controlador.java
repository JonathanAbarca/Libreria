
package com.mycompany.libreria.logica;

import com.mycompany.libreria.persistencia.ControladorPersistencia;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jonathan Abarca
 */
public class Controlador {
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
        fecha = LocalDate.now();
        String fechaHoy = fecha.toString();
        miUsuario.setFecha_Ingreso(fechaHoy);
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
    
    public List<Usuario> buscarUsuarioRut(String rut){        
        return miControlPersis.buscarUsuarioRut(rut);   
    }

    public List<Book> buscarLibro(String nombre) {
        return miControlPersis.buscarLibro(nombre);
    }

    public void reservarLibro(int id_libro,int id_usuario) { 
        Prestamos miPrestamos = new Prestamos();
        LocalDate miFecha = LocalDate.now();
        String hoy = miFecha.toString();
        System.out.println("" + id_libro + id_usuario + hoy);
        miControlPersis.reservarLibro(miPrestamos, id_libro, id_usuario, hoy);
    }
    
    public List<Prestamos> buscarPrestamo (){    
        return miControlPersis.buscarPrestamos();    
    }
   
    
}

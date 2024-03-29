/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria.persistencia;

import com.mycompany.libreria.logica.Book;
import com.mycompany.libreria.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Jonathan Abarca
 */
public class BookJpaController implements Serializable {

    public BookJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public BookJpaController() {
        
        emf = Persistence.createEntityManagerFactory("libreriaPU");        
    }
    
    
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Book book) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Book book) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            book = em.merge(book);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = book.getId_Book();
                if (findBook(id) == null) {
                    throw new NonexistentEntityException("The book with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Book book;
            try {
                book = em.getReference(Book.class, id);
                book.getId_Book();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The book with id " + id + " no longer exists.", enfe);
            }
            em.remove(book);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Book> findBookEntities() {
        return findBookEntities(true, -1, -1);
    }

    public List<Book> findBookEntities(int maxResults, int firstResult) {
        return findBookEntities(false, maxResults, firstResult);
    }

    private List<Book> findBookEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Book.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Book findBook(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Book.class, id);
        } finally {
            em.close();
        }
    }
    
    //creado por mi
    public Book findNameBook(String titulo) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Book.class, titulo);
        } finally {
            em.close();
        }
    }

    public int getBookCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Book> rt = cq.from(Book.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Book> buscarLibroNombre(String nombre) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            String jpql = "SELECT b FROM Book b WHERE b.titulo LIKE :nombre AND b.disponible = 1";
            Query query = em.createQuery(jpql);
            query.setParameter("nombre", "%" + nombre + "%");  // Agregar caracteres de comodín "%" aquí
            List<Book> listaBook = query.getResultList();
            return listaBook;
        } catch (Exception e) {
            // Manejar la excepción aquí
            e.printStackTrace(); // O puedes usar otro método para manejar la excepción
            return Collections.emptyList(); // Devuelve una lista vacía en caso de error
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void cambiarDispo(int id_libro) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin(); // Iniciar la transacción

            String sql = "UPDATE Book b SET b.disponible = 0 WHERE b.id_Book = :id_libro";
            Query query = em.createQuery(sql);
            query.setParameter("id_libro", id_libro);
            query.executeUpdate();

            em.getTransaction().commit(); // Confirmar la transacción si la operación es exitosa
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Revertir la transacción si hay un error
            }
            System.out.println("Error al editar: " + e.getMessage());
        } finally {
            if (em != null) {
                em.close(); // Cerrar el EntityManager solo si no es nulo
            }
        }
    }   
    

    public Book buscarLibroReservado() {
        EntityManager em = getEntityManager();
        try {
            String jpql = "SELECT b FROM Book b WHERE b.disponible = 0";
            Query query = em.createQuery(jpql);
            List<Book> listaBook = query.getResultList();
            if (!listaBook.isEmpty()) {
                return listaBook.get(0); // Devuelve el primer libro de la lista (suponiendo que solo necesitas uno)
            } else {
                return null; // Devuelve null si no se encuentra ningún libro reservado
            }
        } catch (Exception ex) {
            // Manejar la excepción aquí
            ex.printStackTrace(); // o puedes usar otro método para manejar la excepción
            return null; // O maneja la excepción de otra manera según tu lógica de aplicación
        } finally {
            em.close(); // Asegúrate de cerrar el EntityManager en el bloque finally
        }
    }
    
    
}

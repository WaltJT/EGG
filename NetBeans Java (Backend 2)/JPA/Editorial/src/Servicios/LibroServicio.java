/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class LibroServicio {
    
    public Libro guardarLibro(Libro libro) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(libro);
            tx.commit();
            return libro;
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
            emf.close();
        }
    }

    public Libro editarLibro(Libro libro) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            libro = em.merge(libro);
            tx.commit();
            return libro;
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
            emf.close();
        }
    }

    public void darDeBajaLibro(Long libroId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            Libro libro = em.find(Libro.class, libroId);
            if (libro != null) {
                libro.setActivo(false);
                em.merge(libro);
            }
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
            emf.close();
        }
    }

    public Libro buscarLibroPorISBN(String isbn) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn AND l.activo = true", Libro.class);
            query.setParameter("isbn", isbn);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; // Si no se encuentra el libro con el ISBN especificado, devuelve null
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo AND l.activo = true", Libro.class);
            query.setParameter("titulo", titulo);
            return query.getResultList();
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<Libro> buscarLibroPorNombreAutor(String nombreAutor) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre = :nombreAutor AND l.activo = true", Libro.class);
            query.setParameter("nombreAutor", nombreAutor);
            return query.getResultList();
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<Libro> buscarLibroPorNombreEditorial(String nombreEditorial) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre = :nombreEditorial AND l.activo = true", Libro.class);
            query.setParameter("nombreEditorial", nombreEditorial);
            return query.getResultList();
        } finally {
            em.close();
            emf.close();
        }
    }
}

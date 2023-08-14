/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Autor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AutorServicio {
    
// Métodos para administrar autores (consulta, creación, modificación y eliminación)
    
    public Autor guardarAutor(Autor autor) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    try {
        tx.begin();
        em.persist(autor);
        tx.commit();
        return autor;
    } catch (Exception e) {
        tx.rollback();
        throw e;
    } finally {
        em.close();
        emf.close();
    }
}

   public Autor editarAutor(Autor autor) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    try {
        tx.begin();
        autor = em.merge(autor);
        tx.commit();
        return autor;
    } catch (Exception e) {
        tx.rollback();
        throw e;
    } finally {
        em.close();
        emf.close();
    }
}

   public void darDeBajaAutor(Long autorId) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    try {
        tx.begin();
        Autor autor = em.find(Autor.class, autorId);
        if (autor != null) {
            autor.setActivo(false);
            em.merge(autor);
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

   public Autor buscarAutorPorNombre(String nombre) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    try {
        TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre AND a.activo = true", Autor.class);
        query.setParameter("nombre", nombre);
        return query.getSingleResult();
    } catch (NoResultException e) {
        return null; // Si no se encuentra el autor con el nombre especificado, devuelve null
    } finally {
        em.close();
        emf.close();
    }
}
   
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Editorial.Editorial;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EditorialServicio {
    
    public Editorial guardarEditorial(Editorial editorial) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(editorial);
            tx.commit();
            return editorial;
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
            emf.close();
        }
    }

    public Editorial editarEditorial(Editorial editorial) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            editorial = em.merge(editorial);
            tx.commit();
            return editorial;
        } catch (Exception e) {
            tx.rollback();
            throw e;
        } finally {
            em.close();
            emf.close();
        }
    }

    public void darDeBajaEditorial(Long editorialId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            Editorial editorial = em.find(Editorial.class, editorialId);
            if (editorial != null) {
                editorial.setActivo(false);
                em.merge(editorial);
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

    public Editorial buscarEditorialPorNombre(String nombre) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre AND e.activo = true", Editorial.class);
            query.setParameter("nombre", nombre);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; // Si no se encuentra la editorial con el nombre especificado, devuelve null
        } finally {
            em.close();
            emf.close();
        }
    }
}

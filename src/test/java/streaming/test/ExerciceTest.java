/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.data.domain.Persistable;
import streaming.entity.Film;

/**
 *
 * @author renob
 */
public class ExerciceTest {
    @Test
    public void req1() {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
       Query query = em.createQuery("SELECT f FROM Film f WHERE f.id=4");
       Film film = (Film) query.getSingleResult();
       
        System.out.println(film.getTitre());
    }
    @Test
    public void req2() {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
       Query query = em.createQuery("SELECT COUNT(f) FROM Film f");
       
       long r = (long) query.getSingleResult();
       
       System.out.println(r);
    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }
//    @Test
//    public void reqX() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       
//       Query query = em.createQuery("");
//       
//       
//        System.out.println();
//    }


}
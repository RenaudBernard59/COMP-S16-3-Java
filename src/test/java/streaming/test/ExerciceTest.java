/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static org.junit.Assert.*;
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
       System.out.println("Vérifier que le titre du film d'id 4 est \"Fargo\"");
       System.out.println(film.getTitre());
    }
    @Test
    public void req2() {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Query query = em.createQuery("SELECT COUNT(f) FROM Film f");
       long r = (long) query.getSingleResult();
       System.out.println("Vérifier le nombre de films");
       System.out.println(r);
    }
    @Test
    public void req3() {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Query query = em.createQuery("SELECT MIN(f.annee) FROM Film f");
       int i = (int) query.getSingleResult();
       assertEquals(1968,i);
       System.out.println("Année de prod mini de nos films");
       System.out.println(i);
    }
    @Test
    public void req4() {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Query query = em.createQuery("SELECT COUNT(l) FROM Lien l JOIN l.film f WHERE f.titre='Big Lebowski (The)'");
       long r = (long) query.getSingleResult();
       assertEquals(1L, r);
       System.out.println("Nombre de liens du film 'Big Lebowski (The)'");
       System.out.println(r);
    }
    @Test
    public void req5() {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Query query = em.createQuery("SELECT COUNT(f) FROM Film f JOIN f.realisateurs r WHERE r.nom='Polanski'");
       long r = (long) query.getSingleResult();
       System.out.println("Nombre de films réalisés par Polanski");
       System.out.println(r);
    }
//    @Test
//    public void req6() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
///       xxx x = xxxx
//       System.out.println("Nombre de films interprétés par Polanski");
//       System.out.println(x);
//    }
//    @Test
//    public void req7() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.out.println("Nombre de films à la fois interprétés et réalisés par polanski");
//       System.out.println(x);
//    }
//    @Test
//    public void req8() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le titre du film d'horreur anglais réalisé par roman polanski");
//       System.out.println(x);
//    }
//    @Test
//    public void req9() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nomnbre de films réalisés par joel coen");
//       System.out.println(x);
//    }
//    @Test
//    public void req10() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("nombre de films réalisés à la fois par les 2 frères coen");
//       System.out.println(x);
//    }
//    @Test
//    public void req11() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre de films réalisés à la fois par les 2 frères Coen, et interprétés par Steve Buscemi");
//       System.out.println(x);
//    }
//    @Test
//    public void req12() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre de films policiers réalisés à la fois par les 2 frères Coen, et interprétés par Steve Buscemi");
//       System.out.println(x);
//    }
//    @Test
//    public void req13() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre de saisons de la série Dexter");
//       System.out.println(x);
//    }
//    @Test
//    public void req14() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre total d'épisodes de la série Dexter");
//       System.out.println(x);
//    }
//    @Test
//    public void req15() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre d'épisodes de la saison 8 de la série Dexter");
//       System.out.println(x);
//    }
//    @Test
//    public void req16() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre total de liens pour nos films policiers américains");
//       System.out.println(x);
//    }
//    @Test
//    public void req17() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre totals de liens pour nos films d'horreur interprétés par Polanski");
//       System.out.println(x);
//    }
//    @Test
//    public void req18() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Tous les films d'horreur, sauf ceux interprétés par Polanski ( utiliser UNION ou MINUS ou INTERSECT )");
//       System.out.println(x);
//    }
//    @Test
//    public void req19() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Parmi tous les films, uniquement ceux interprétés par Polanski  ( utiliser UNION ou MINUS ou INTERSECT )");
//       System.out.println(x);
//    }
//    @Test
//    public void req20() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Tous les films interprétés par Polanski et aussi tous les films d'horreur ( utiliser UNION ou MINUS ou INTERSECT )");
//       System.out.println(x);
//    }
//    @Test
//    public void req21() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre de films réalisés pour chaque genre ( GROUP BY )");
//       System.out.println(x);
//    }
//    @Test
//    public void req22() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre de films réalisés pour chaque réalisateur, triés par ordre croissant puis par ordre alphabétique ( GROUP BY )");
//       System.out.println(x);
//    }
//    @Test
//    public void req23() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre de films réalisés pour chaque réalisateur, uniquement si >= 2 ( GROUP BY et HAVING )");
//       System.out.println(x);
//    }
//    @Test
//    public void req24() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre total de saisons pour chaque série, triés par ordre croissant de saisons, puis par ordre alphabétique.");
//       System.out.println(x);
//    }
//    @Test
//    public void req25() {
//       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//       Query query = em.createQuery("");
//       xxx x = xxxx
//       System.ontlnut.println("Le nombre total d'épisodes pour chaque série, pour peu qu'il y ait plus de 5 épisodes au total. Le tout trié par nbre d'épisodes.");
//       System.out.println(x);
//    }

}
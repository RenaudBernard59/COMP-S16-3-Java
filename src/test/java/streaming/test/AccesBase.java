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
import streaming.entity.Film;
import streaming.entity.Genre;

/**
 *
 * @author renob
 */
public class AccesBase {
    
    @Test
    public void ajouter() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        //Récupérer Fantastique
        Query query = em.createQuery("SELECT g FROM Genre g WHERE g.nom='Fantastique'");
        Genre g = (Genre) query.getSingleResult();
        
        //Ajouter
        Film f = new Film();
        
        //Récupérer Genre Fantastic
        //Genre g = em.find(Genre.class, 3L);
        
        f.setId(Long.MIN_VALUE);
        em.persist(f);
        
        f.setTitre("5ème Element");
        f.setAnnee(1997);
        f.setGenre(g);
        g.getFilms().add(f);
        
        
        em.getTransaction().commit();
        
    }
    
}

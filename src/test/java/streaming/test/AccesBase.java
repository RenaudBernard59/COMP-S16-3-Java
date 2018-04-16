/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Film;

/**
 *
 * @author renob
 */
public class AccesBase {
    
    @Test
    public void ajouter() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        //Ajouter
        Film f = new Film();
        
        f.setId(Long.MIN_VALUE);
        em.persist(f);
        
        
        f.setTitre("5ème Element");
        f.setAnnee(1997);
        em.getTransaction().commit();
        
    }
    
}

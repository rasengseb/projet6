package dao;

import hibernate.Site;
import hibernate.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SiteDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveSite(Site site){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(site.getId()==null){
            em.persist(site);
        }else{
            em.merge(site);
        }
    }

    public Site showSite(Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Site.class, id);
    }

    public void deleteSite(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Site.class, id));
        tx.commit();
    }
}

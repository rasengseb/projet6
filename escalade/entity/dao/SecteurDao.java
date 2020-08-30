package dao;

import hibernate.Secteur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SecteurDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Secteur secteur){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(secteur.getId()==null){
            em.persist(secteur);
        }else{
            em.merge(secteur);
        }
    }

    public Secteur showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Secteur.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Secteur.class, id));
        tx.commit();
    }
}

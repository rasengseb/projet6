package dao;

import hibernate.Voie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VoieDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Voie voie){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(voie.getId()==null){
            em.persist(voie);
        }else{
            em.merge(voie);
        }
    }

    public Voie showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Voie.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Voie.class, id));
        tx.commit();
    }
}

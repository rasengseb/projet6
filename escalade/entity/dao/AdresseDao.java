package dao;

import hibernate.Adresse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AdresseDao {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Adresse adresse){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(adresse.getId()==null){
            em.persist(adresse);
        }else{
            em.merge(adresse);
        }
    }

    public Adresse showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Adresse.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Adresse.class, id));
        tx.commit();
    }
}

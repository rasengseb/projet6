package dao;

import hibernate.Cotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CotationDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Cotation cotation){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(cotation.getId()==null){
            em.persist(cotation);
        }else{
            em.merge(cotation);
        }
    }

    public Cotation showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Cotation.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Cotation.class, id));
        tx.commit();
    }
}

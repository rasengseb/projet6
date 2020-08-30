package dao;

import hibernate.Region;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RegionDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Region region){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(region.getId()==null){
            em.persist(region);
        }else{
            em.merge(region);
        }
    }

    public Region showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Region.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Region.class, id));
        tx.commit();
    }
}

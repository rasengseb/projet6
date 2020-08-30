package dao;

import hibernate.Topo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TopoDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Topo topo){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(topo.getId()==null){
            em.persist(topo);
        }else{
            em.merge(topo);
        }
    }

    public Topo showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Topo.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Topo.class, id));
        tx.commit();
    }
}

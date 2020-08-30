package dao;

import hibernate.Departement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DepartementDao {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("connect");

    public void saveUser(Departement departement){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if(departement.getId()==null){
            em.persist(departement);
        }else{
            em.merge(departement);
        }
    }

    public Departement showUser (Integer id){
        EntityManager em = emf.createEntityManager();
        return em.find(Departement.class, id);
    }

    public void deleteUser(Integer id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.remove(em.find(Departement.class, id));
        tx.commit();
    }
}
